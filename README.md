# FTPClient
A Basic app in spring framework to create a ftp client

technology used:
1) Java
2) spring
3) mongo db
4) html

Description:

This is a Demo app developed in Spring framework to create a ftp client to connect to a ftp server and perform basic task.

1) Login to the server using authentication with specified username and password through mongo db.
2) After successfull login redirection to a Home page where FTP client where the user enter
  - username of the ftp server
  - domain name/ Ip address
  - password to connect to the ftp server.

3) After this a redirection to a page displaying that ftp login was successful.
4) In the console logs you can also see the "ls" command execution at the ftp server to verify that connection was indeed established.
5) Similarly you can also explore many API. For this basic demo i only established the connection and verified just the simple "ls" command.


Note: change the mvnw.java to mvnw and .cmd.java to .cmd while using.
