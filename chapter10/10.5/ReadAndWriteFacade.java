public class ReadAndWriteFacade{
    private ReadFile readFile;
    private AnalyzeInformation analyzeInformation;
    private WriteFile writeFile;
    public ReadAndWriteFacade(){
       readFile=new ReadFile();
       analyzeInformation=new AnalyzeInformation();
       writeFile=new WriteFile();
    }
    public void doOption(String readFileName,String delContent,String savedFileName){ 
       String content=readFile.readFileContent(readFileName);
       System.out.println("读取文件"+readFileName+"的内容:");
       System.out.println(content);
       String savedContent=analyzeInformation.getSavedContent(content,delContent);
       writeFile.writeToFile(savedFileName,savedContent);
       System.out.println("保存到文件"+savedFileName+"中的内容:");
       System.out.println(savedContent);
       
    } 
}