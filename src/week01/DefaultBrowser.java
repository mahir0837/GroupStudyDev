package week01;

import java.awt.*;
import java.net.URI;

public class DefaultBrowser {
    public static void main(String[] args)
            throws Exception
    {
        Desktop desk = Desktop.getDesktop();

        // now we enter our URL that we want to open in our
        // default browser
        desk.browse(new URI("http://google.com"));
    }

}
