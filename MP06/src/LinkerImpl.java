import java.util.List;

public class LinkerImpl implements Linker {
    public Executable link(String exeFileName, ObjectCode[] objFiles) {
        System.out.print("Linking");
        StringBuilder objFileNames = new StringBuilder();
        for (ObjectCode obj : objFiles) {
            objFileNames.append("\n").append(obj.getObjectName());
        }
        System.out.println(objFileNames);
        return new Executable(exeFileName, objFileNames.toString());
    }
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        System.out.print("Linking");
        StringBuilder objFileNames = new StringBuilder();
        for (ObjectCode obj : objFiles) {
            objFileNames.append("\n").append(obj.getObjectName());
        }
        System.out.println(objFileNames);
        return new Executable(exeFileName, objFileNames.toString());
    }
}
