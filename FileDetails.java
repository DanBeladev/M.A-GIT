import java.util.Date;

public class FileDetails {
    private String m_Name;
    private String m_Sh1;
    private FileType m_FileType;
    private String m_WhoUpdatedLast;
    private Date m_LastUpdated;

    @Override
    public String toString() {
        return
                m_Name + "," +
                        m_Sh1 + "," +
                        m_FileType + ","
                        + m_WhoUpdatedLast + "," +
                        m_LastUpdated + "\n";
    }

}
