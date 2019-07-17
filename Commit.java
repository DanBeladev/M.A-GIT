import java.util.Date;
import java.util.List;

public class Commit extends File {
    private String m_MainFolderSH1;
    private List<String> m_PrevCommits;
    private String m_Message;
    private String m_WhoUpdated;
    private Date m_CreateTime;

    @Override
    public String MakeSH1() {
        return GetSH1FromContent(this.toString());
    }

    @Override
    public String toString() {
        return
                m_MainFolderSH1 + ',' +
                        m_PrevCommits + ',' +
                        m_Message + ',' +
                        m_WhoUpdated + ',' +
                        m_CreateTime;

    }
}
