import images.APImage;
import images.Pixel;
public class ImageCollage
{
    public static void main(String[] args)
    {
        APImage image = new APImage("Mudkip.jpg");
        int width = image.getImageWidth();
        int height = image.getImageHeight();
        APImage collage = new APImage(width * 2, height * 2);

        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                Pixel p = image.getPixel(x, y);
                Pixel corn1 = collage.getPixel(x, y);

                int r = p.getRed();
                int g = p.getGreen();
                int b = p.getBlue();

                corn1.setRed(r);
                corn1.setGreen(g);
                corn1.setBlue(b);

                int mirror1 = (((width* 2)) - x);
                collage.setPixel(mirror1, y + height - 1, corn1 );

                Pixel corn2 = collage.getPixel(x, y + height);

                int r2 = p.getRed();

                corn2.setRed(r2);
                corn2.setGreen(r2);
                corn2.setBlue(r2);

                int mirror2 = (((width * 2)) - x);
                collage.setPixel(mirror2, y, corn2 );


            }

        }
        collage.draw();
    }
}