package pradeep.ftp;


import org.apache.commons.net.ftp.FTPClient;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilters;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.ftp.Ftp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import java.io.IOException;

import static com.sun.deploy.net.protocol.ProtocolType.FTP;

@Controller
public class ftpClient {
    @RequestMapping(value = "/ftp1", method = RequestMethod.GET)
    public String ftp1() {
        return "ftp1";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ftp() {
        return "ftp";
    }

    @RequestMapping(value = "/ftp", method = RequestMethod.POST)
    public String ftp(ModelMap map, HttpSession session,
                      @RequestParam(value = "username") String Username,
                      @RequestParam(value = "password") String password,
                      @RequestParam(value = "ipAddr") String ipAddr) throws IOException {
        session.setAttribute("ans", Username);

        System.out.println(Username);

        System.out.println(password);

        System.out.println(ipAddr);

        int port = 21;
        FTPClient ftpClient = new FTPClient();
        try {
                ftpClient.connect(ipAddr, port);

                ftpClient.login(Username, password);
                ftpClient.enterLocalPassiveMode();

                if (ftpClient.isConnected()){
                    FTPFile file[] = ftpClient.listFiles();
                    for (int i=0; i < file.length;i++)
                    System.out.println(file[i].toString());
                    return "ftp1";
                }
                else {
                    //ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                    return "ftp2";
                }


            } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //return ftp_client;

}
