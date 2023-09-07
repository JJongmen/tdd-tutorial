package chap07;

public interface AutoDebitInfoRepository {
    void save(final AutoDebitInfo info);
    AutoDebitInfo findOne(final String userId);
}
