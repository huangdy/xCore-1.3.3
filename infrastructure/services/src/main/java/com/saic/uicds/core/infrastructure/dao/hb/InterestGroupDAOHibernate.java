package com.saic.uicds.core.infrastructure.dao.hb;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.saic.uicds.core.dao.hb.GenericHibernateDAO;
import com.saic.uicds.core.infrastructure.dao.InterestGroupDAO;
import com.saic.uicds.core.infrastructure.model.InterestGroup;

public class InterestGroupDAOHibernate
    extends GenericHibernateDAO<InterestGroup, Integer>
    implements InterestGroupDAO {

    @Override
    public InterestGroup findByInterestGroup(String interestGroupID) {

        Criterion criterion = Restrictions.eq("interestGroupID", interestGroupID);
        List<InterestGroup> interestGroups = findByCriteria(criterion);

        return (interestGroups != null && interestGroups.size() != 0)
            ? interestGroups.get(0)
            : null;
    }

    @Override
    public List<InterestGroup> findByOwningCore(String owningCore) {

        Criterion criterion = Restrictions.eq("owningCore", owningCore);
        List<InterestGroup> interestGroups = findByCriteria(criterion);

        return interestGroups;
    }

    @Override
    public void delete(String interestGroupID, boolean isDelete) {

        InterestGroup interestGroup = findByInterestGroup(interestGroupID);
        if (interestGroup == null)
            return;

        if (isDelete == true) {
            makeTransient(interestGroup);
        } else {
            interestGroup.setActive(false);
            makePersistent(interestGroup);
        }
    }

}
