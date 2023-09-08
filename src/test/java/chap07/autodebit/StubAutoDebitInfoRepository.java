package chap07.autodebit;

public class StubAutoDebitInfoRepository implements AutoDebitInfoRepository {
    @Override
    public void save(final AutoDebitInfo info) {

    }

    @Override
    public AutoDebitInfo findOne(final String userId) {
        return null;
    }
}
