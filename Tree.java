import java.util.List;

public class Tree extends  File {
    private List<FileDetails> m_InnerFiles;

    @Override
    public String MakeSH1() {
        return GetSH1FromContent(this.toString());
    }

    @Override
    public String toString() {
        String str = "";
        for(FileDetails fileDetails : m_InnerFiles)
        {
            str= str + fileDetails.toString();
        }
        return  str;
    }
}


