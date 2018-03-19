package pradeep.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlowBuilder;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.file.Files;
import org.springframework.integration.dsl.ftp.Ftp;
import org.springframework.integration.transformer.GenericTransformer;
import sun.net.ftp.impl.DefaultFtpClientProvider;

import javax.xml.transform.Source;
import java.io.File;

@SpringBootApplication
@IntegrationComponentScan
@EnableIntegration
public class FtpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtpApplication.class, args);
    }


}


