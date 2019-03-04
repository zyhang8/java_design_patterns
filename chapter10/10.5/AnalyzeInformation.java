import java.util.regex.*;
public class AnalyzeInformation{
    public String getSavedContent(String content,String deleteContent){
        Pattern p;   
        Matcher m;
        p=Pattern.compile(deleteContent);              
        m=p.matcher(content);     
        String savedContent=m.replaceAll("");
        return savedContent;
    }
}