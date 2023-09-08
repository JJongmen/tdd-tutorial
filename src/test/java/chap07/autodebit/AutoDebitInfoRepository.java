package chap07.autodebit;

public interface AutoDebitInfoRepository {
    void save(final AutoDebitInfo info);
    AutoDebitInfo findOne(final String userId);
}
