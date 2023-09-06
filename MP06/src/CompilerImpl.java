public class CompilerImpl implements Compiler {
    public ObjectCode compile(SourceCode sc) {
        System.out.println("Compiling code: "+ sc.getSourceName());
        int endIndex = sc.getSourceName().lastIndexOf('.');
        String objectName = sc.getSourceName().substring(0, endIndex) + ".obj";
        System.out.println("Generating object code: " + objectName);
        return new ObjectCode(objectName);
    }
}
