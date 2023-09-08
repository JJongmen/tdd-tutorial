package chap08.nontestable;

import chap08.payinfo.PayInfo;
import chap08.payinfo.PayInfoDao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PaySync {
    private PayInfoDao payInfoDao = new PayInfoDao();

    public void sync() throws IOException {
        Path path = Paths.get("D:\\data\\pay\\cp0001.csv");
        final List<PayInfo> payInfos = Files.lines(path)
                .map(line -> {
                    final String[] data = line.split(",");
                    return new PayInfo(
                            data[0], data[1], Integer.parseInt(data[2])
                    );
                })
                .toList();
        payInfos.forEach(pi -> payInfoDao.insert(pi));
    }
}
