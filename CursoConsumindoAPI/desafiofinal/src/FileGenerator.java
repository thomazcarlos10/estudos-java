import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void fileGeneratorJson(AddressData addressData) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            FileWriter fileWriter = new FileWriter(addressData.cep() + ".json");
            fileWriter.write(gson.toJson(addressData));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
