import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
    private String filename;
    public LoadHudDisplays(String filename) {
        this.filename = filename;
    }
    @Override
    public ArrayList<String> load() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                list.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
