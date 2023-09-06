public class PreprocessorImpl implements Preprocessor {
    public SourceCode preprocess(SourceCode sc) {
        SourceCode sourceCode = new SourceCode(sc.getSourceName());
        System.out.println("Preprocessing code: " + sourceCode.getSourceName());
        sourceCode.setSourceName("preprocessed_" + sourceCode.getSourceName());
        System.out.println("Generating a new code: " + sourceCode.getSourceName());
        return sourceCode;
    }
}
