/**
 * 
 */
package com.saic.uicds.core.infrastructure.test.util;

import javax.annotation.Resource;
import java.util.List;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;

import com.saic.uicds.core.infrastructure.dao.WorkProductDAO;
import com.saic.uicds.core.infrastructure.model.WorkProduct;

/**
 * Extension of the Spring AbstractJpaTests that will clean up the Exist
 * database entries after running a test.  Currently this clears the entire
 * UICDS collection from the Exist database.
 * 
 * TODO: create an @Before that will log what resources got put into Exist
 * and change the @After to only remove those resources.
 * 
 * @author roger
 *
 */
public abstract class AbstractXmldbJpaTests extends AbstractJpaTests {
	
	@Resource(name="workProductDAO")
	WorkProductDAO workProductDAO;

	/**
	 * 
	 */
	public AbstractXmldbJpaTests() {
		super();
	}

	protected void cleanupXMLDB() throws Exception {
		if (workProductDAO != null) {
			List<WorkProduct> workProducts = workProductDAO.findAll();
			for (WorkProduct wp : workProducts) {
				workProductDAO.makeTransient(wp);
			}
		}
		else {
			System.err.println("workProductDAO is null so eXist DB was not cleaned up");
		}
	}
	
	@Override
	protected void onTearDownAfterTransaction() throws Exception {
		cleanupXMLDB();
		super.onTearDownAfterTransaction();
	}
}
