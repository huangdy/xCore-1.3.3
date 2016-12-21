/**
 * 
 */
package com.saic.uicds.xmpp.communications;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.saic.uicds.xmpp.apps.CoreXMPPUtils;
import com.saic.uicds.xmpp.communications.CoreConnection;
import com.saic.uicds.xmpp.communications.NodeManagerImpl;
import com.saic.uicds.xmpp.communications.NodeManagerImpl.NODE_ITEM_TYPE;

/**
 * @author roger
 * 
 */
public class CoreXMPPUtilsTest extends AbstractDependencyInjectionSpringContextTests {

    CoreConnection coreConnection;

    final static String incidentRoot = "incidents";
    final static String incident1 = "incident1";
    final static String incident2 = "incident2";
    final static String incident1WP = "incident1WP";
    final static String incident1Node = "incident1Node";
    final static String incident2WP = "incident2WP";
    final static String incident2Node = "incident2Node";

    public void setCoreConnection(CoreConnection c) {
        coreConnection = c;
    }

    @Override
    protected String[] getConfigLocations() {
        // return new String[] { "classpath:contexts/test-xmppUtils.xml" };
        return new String[] { "classpath:contexts/test-applicationContext.xml" };
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void onSetUp() throws Exception {
        // This is bad form to use the class under test to clean up before the test
        CoreXMPPUtils utils = new CoreXMPPUtils();
        utils.setCoreConnection(coreConnection);
        utils.deleteAllNodesRecursivly();
    }

    private void createTestNodes() {
        if (coreConnection != null) {
            NodeManager nm = new NodeManagerImpl(coreConnection);
            nm.addCollection(incidentRoot);

            nm.addFolder(incidentRoot, incident1);
            nm.addNode(incident1, incident1WP, NODE_ITEM_TYPE.ITEM_LIST, "");
            nm.addNode(incident1, incident1Node, NODE_ITEM_TYPE.ITEM_LIST, "");

            nm.addFolder(incidentRoot, incident2);
            nm.addNode(incident2, incident2WP, NODE_ITEM_TYPE.ITEM_LIST, "");
            nm.addNode(incident2, incident2Node, NODE_ITEM_TYPE.ITEM_LIST, "");
        } else {
            logger.error("coreConnection is null");
        }
    }

    private void removeTestNodes() {
        if (coreConnection != null) {
            NodeManager nm = new NodeManagerImpl(coreConnection);
            nm.removeNode(incidentRoot);
            nm.removeNode(incident1);
            nm.removeNode(incident1WP);
            nm.removeNode(incident1Node);

            nm.removeNode(incident2);
            nm.removeNode(incident2WP);
            nm.removeNode(incident2Node);
        } else {
            logger.error("coreConnection is null");
        }
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void onTearDown() throws Exception {
    }

    /**
     * Test method for {@link com.saic.uicds.xmpp.apps.CoreXMPPUtils#getAllNodesRecursivly()}.
     */
    @Test
    public void testGetAllNodes() {
        CoreXMPPUtils utils = new CoreXMPPUtils();
        utils.setCoreConnection(coreConnection);

        removeTestNodes();
        List<String> nodeList = utils.getAllNodesRecursivly();
        assertTrue("size is: " + nodeList.size(), nodeList.size() == 0);

        createTestNodes();
        nodeList = utils.getAllNodesRecursivly();
        assertTrue("size is: " + nodeList.size(), nodeList.size() == 7);

        for (String node : nodeList) {
            logger.info(node);
        }

        removeTestNodes();
        nodeList = utils.getAllNodesRecursivly();
        assertTrue("size is: " + nodeList.size(), nodeList.size() == 0);
    }

    /**
     * Test method for {@link com.saic.uicds.xmpp.apps.CoreXMPPUtils#getChildrenNodes()}.
     */
    @Test
    public void testGetChildrenNodes() {
        createTestNodes();
        CoreXMPPUtils utils = new CoreXMPPUtils();
        utils.setCoreConnection(coreConnection);

        Set<String> nodeSet = utils.getChildrenNodes(incidentRoot);
        assertTrue("size is: " + nodeSet.size(), nodeSet.size() == 2);

        // Check that the incident root contains the two incidents
        assertTrue(nodeSet.contains(incident1));
        assertTrue(nodeSet.contains(incident2));

        // Check each incident contains their nodes
        nodeSet.clear();
        nodeSet = utils.getChildrenNodes(incident1);
        assertTrue(nodeSet.contains(incident1Node));
        assertTrue(nodeSet.contains(incident1WP));

        nodeSet.clear();
        nodeSet = utils.getChildrenNodes(incident2);
        assertTrue(nodeSet.contains(incident2Node));
        assertTrue(nodeSet.contains(incident2WP));

        removeTestNodes();
        List<String> nodeList = utils.getAllNodesRecursivly();
        assertTrue("size is: " + nodeList.size(), nodeList.size() == 0);
    }

    /**
     * Test method for
     * {@link com.saic.uicds.xmpp.apps.CoreXMPPUtils#deleteAllNodesRecursivly()}.
     */
    @Test
    public void testDeleteAllNodes() {
        createTestNodes();
        CoreXMPPUtils utils = new CoreXMPPUtils();
        utils.setCoreConnection(coreConnection);

        utils.deleteAllNodesRecursivly();

        List<String> nodes = utils.getAllNodesRecursivly();
        assertTrue(nodes.size() == 0);
    }

    @Test
    public void testGetNodeSet() {
        createTestNodes();
        CoreXMPPUtils utils = new CoreXMPPUtils();
        utils.setCoreConnection(coreConnection);

        Set<CoreXMPPUtils.XMPPNode> nodeSet = utils.getNodeSet();
        for (CoreXMPPUtils.XMPPNode node : nodeSet) {
            logger.info(node.name);
            logger.info(node.toString());
        }

        removeTestNodes();
        List<String> nodeList = utils.getAllNodesRecursivly();
        assertTrue("size is: " + nodeList.size(), nodeList.size() == 0);
    }
}
