### Sockets in Java 

Zuerst benötigt man 2 java Klassen eine für den Server und eine für den Client. 

## Server Klasse 

``` java
    import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.lang.ClassNotFoundException;
	import java.net.ServerSocket;
	import java.net.Socket;
```

``` java
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
```

In diesem Code 