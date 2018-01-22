@echo off
@title VxC_Svr
set CLASSPATH=.;dist\*
java -Xmx2048m net.server.Server
pause