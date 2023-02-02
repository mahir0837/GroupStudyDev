package week01;

import java.awt.*;
import java.net.URI;

public class DefaultBrowser {
    public static void main(String[] args)
            throws Exception
    {

        Desktop desktop=Desktop.getDesktop();
        desktop.browse(new URI("www.cydeo.com"));

    }

}
