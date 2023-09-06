import java.util.List;

public class IDE implements Builder {
    String projectName;
    public void createProject(String projectName) {
        this.projectName = projectName;
    }
    public Executable build(SourceCode[] sourceCodes) {
        Preprocessor preprocessor = new PreprocessorImpl();
        Compiler compiler = new CompilerImpl();
        Linker linker = new LinkerImpl();
        // 프리프로세서, 컴파일러 사용
        SourceCode[] preprocessedCode = new SourceCode[sourceCodes.length];
        ObjectCode[] objs = new ObjectCode[sourceCodes.length];
        for (int i = 0; i < sourceCodes.length; i++) {
            preprocessedCode[i] = preprocessor.preprocess(sourceCodes[i]);
            objs[i] = compiler.compile(preprocessedCode[i]);
        }
        // 링커 사용 및 Executable 리턴
        return linker.link(projectName, objs);
    }
    public Executable build(List<SourceCode> sourceCodes) {
        Preprocessor preprocessor = new PreprocessorImpl();
        Compiler compiler = new CompilerImpl();
        Linker linker = new LinkerImpl();
        // 프리프로세서, 컴파일러 사용
        SourceCode[] preprocessedCode = new SourceCode[sourceCodes.size()];
        ObjectCode[] objs = new ObjectCode[sourceCodes.size()];
        for (int i = 0; i < sourceCodes.size(); i++) {
            preprocessedCode[i] = preprocessor.preprocess(sourceCodes.get(i));
            objs[i] = compiler.compile(preprocessedCode[i]);
        }
        // 링커 사용 및 Executable 리턴
        return linker.link(projectName, objs);
    }
}
