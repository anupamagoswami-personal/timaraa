package Google_sheet;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.auth.oauth2.GoogleCredential;

import java.io.FileInputStream;
import java.util.List;
public class GoogleSheetUtils {
        private static final String APPLICATION_NAME = "RegisterAutomation";
        private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
        private static final String SPREADSHEET_ID = "your_google_sheet_id";
        private static final String RANGE = "Sheet1!A1"; // Or A2 if A1 has headers
    
        private static Sheets sheetsService;
    
        public static Sheets getSheetsService() throws Exception {
            if (sheetsService == null) {
                FileInputStream serviceAccountStream = new FileInputStream("src/test/Google_sheet/GoogleSheetUtils.java");
    
                GoogleCredential credential = GoogleCredential.fromStream(serviceAccountStream)
                        .createScoped(List.of("https://www.googleapis.com/auth/spreadsheets"));
    
                sheetsService = new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, credential)
                        .setApplicationName(APPLICATION_NAME)
                        .build();
            }
            return sheetsService;
        }
    
        public static void appendCredentials(String username, String password) throws Exception {
            Sheets service = getSheetsService();
    
            ValueRange appendBody = new ValueRange()
                    .setValues(Arrays.asList(Arrays.asList(username, password)));
    
            service.spreadsheets().values()
                    .append(SPREADSHEET_ID, RANGE, appendBody)
                    .setValueInputOption("RAW")
                    .execute();
    
            System.out.println("✅ Credentials stored in Google Sheet.");
        }
    }

