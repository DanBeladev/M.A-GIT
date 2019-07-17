public class Blob extends File {
   private String m_Content;


    @Override
    public String MakeSH1() {
        return GetSH1FromContent(m_Content);
    }
}
