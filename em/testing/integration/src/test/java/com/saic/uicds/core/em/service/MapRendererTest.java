package com.saic.uicds.core.em.service;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.saic.uicds.core.em.util.MapRenderer;

import com.vividsolutions.jts.geom.Envelope;

/**
 * MapRendererTest
 * 
 * @author Patrick Neal - Image Matters, LLC
 * @package com.saic.dctd.uicds.core.service
 * @created Nov 24, 2008
 */
public class MapRendererTest extends Assert {

    static MapRenderer renderer;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        renderer = new MapRenderer();
    }

    @Test
    public void renderImage() throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new FileInputStream("src/test/resources/map/view-context.xml"));
        Node node = document.getDocumentElement();

        Envelope envelope = new Envelope(-120.0, -66.0, 20.0, 50.0);

        String[] layers = new String[0];
        // {
        // "ATLAS_STATES","ATLAS_STATES_LABELS",
        // "ATLAS_COUNTIES_2001","ATLAS_COUNTIES_2001_LABELS"
        // // "Bathymetry",
        // // "Topography"
        // };

        Image image = renderer.render((Element) node, layers, envelope, 500, 500, "image/png");
        assertNotNull(image);

        ImageIO.write((BufferedImage) image, "png", new File("target/map.png"));
    }
}
