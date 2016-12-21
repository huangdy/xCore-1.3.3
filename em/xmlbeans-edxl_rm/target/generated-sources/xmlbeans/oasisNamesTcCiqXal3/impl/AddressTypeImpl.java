/*
 * XML Type:  AddressType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.AddressType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML AddressType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType
{
    private static final long serialVersionUID = 1L;
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREETEXTADDRESS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "FreeTextAddress");
    private static final javax.xml.namespace.QName COUNTRY$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Country");
    private static final javax.xml.namespace.QName ADMINISTRATIVEAREA$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AdministrativeArea");
    private static final javax.xml.namespace.QName LOCALITY$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Locality");
    private static final javax.xml.namespace.QName THOROUGHFARE$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Thoroughfare");
    private static final javax.xml.namespace.QName PREMISES$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Premises");
    private static final javax.xml.namespace.QName POSTCODE$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "PostCode");
    private static final javax.xml.namespace.QName RURALDELIVERY$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "RuralDelivery");
    private static final javax.xml.namespace.QName POSTALDELIVERYPOINT$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "PostalDeliveryPoint");
    private static final javax.xml.namespace.QName POSTOFFICE$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "PostOffice");
    private static final javax.xml.namespace.QName GEORSS$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "GeoRSS");
    private static final javax.xml.namespace.QName LOCATIONBYCOORDINATES$22 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "LocationByCoordinates");
    private static final javax.xml.namespace.QName TYPE$24 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
    private static final javax.xml.namespace.QName ADDRESSID$26 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AddressID");
    private static final javax.xml.namespace.QName ADDRESSIDTYPE$28 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AddressIDType");
    private static final javax.xml.namespace.QName ID$30 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "ID");
    private static final javax.xml.namespace.QName USAGE$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Usage");
    private static final javax.xml.namespace.QName DELIVERYMODE$34 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "DeliveryMode");
    private static final javax.xml.namespace.QName STATUS$36 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Status");
    private static final javax.xml.namespace.QName DATEVALIDFROM$38 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
    private static final javax.xml.namespace.QName DATEVALIDTO$40 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
    private static final javax.xml.namespace.QName ADDRESSKEY$42 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AddressKey");
    private static final javax.xml.namespace.QName ADDRESSKEYREF$44 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AddressKeyRef");
    private static final javax.xml.namespace.QName TYPE2$46 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    private static final javax.xml.namespace.QName LABEL$48 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "label");
    private static final javax.xml.namespace.QName HREF$50 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "href");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$52 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$54 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$56 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    private static final javax.xml.namespace.QName LANGUAGECODE$58 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
    
    
    /**
     * Gets the "FreeTextAddress" element
     */
    public oasisNamesTcCiqXal3.AddressType.FreeTextAddress getFreeTextAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.FreeTextAddress target = null;
            target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress)get_store().find_element_user(FREETEXTADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FreeTextAddress" element
     */
    public boolean isSetFreeTextAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREETEXTADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "FreeTextAddress" element
     */
    public void setFreeTextAddress(oasisNamesTcCiqXal3.AddressType.FreeTextAddress freeTextAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.FreeTextAddress target = null;
            target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress)get_store().find_element_user(FREETEXTADDRESS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress)get_store().add_element_user(FREETEXTADDRESS$0);
            }
            target.set(freeTextAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "FreeTextAddress" element
     */
    public oasisNamesTcCiqXal3.AddressType.FreeTextAddress addNewFreeTextAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.FreeTextAddress target = null;
            target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress)get_store().add_element_user(FREETEXTADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FreeTextAddress" element
     */
    public void unsetFreeTextAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREETEXTADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public oasisNamesTcCiqXal3.AddressType.Country getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Country target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Country)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$2) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(oasisNamesTcCiqXal3.AddressType.Country country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Country target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Country)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.Country)get_store().add_element_user(COUNTRY$2);
            }
            target.set(country);
        }
    }
    
    /**
     * Appends and returns a new empty "Country" element
     */
    public oasisNamesTcCiqXal3.AddressType.Country addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Country target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Country)get_store().add_element_user(COUNTRY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$2, 0);
        }
    }
    
    /**
     * Gets the "AdministrativeArea" element
     */
    public oasisNamesTcCiqXal3.AddressType.AdministrativeArea getAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.AdministrativeArea target = null;
            target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AdministrativeArea" element
     */
    public boolean isSetAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINISTRATIVEAREA$4) != 0;
        }
    }
    
    /**
     * Sets the "AdministrativeArea" element
     */
    public void setAdministrativeArea(oasisNamesTcCiqXal3.AddressType.AdministrativeArea administrativeArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.AdministrativeArea target = null;
            target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea)get_store().find_element_user(ADMINISTRATIVEAREA$4, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$4);
            }
            target.set(administrativeArea);
        }
    }
    
    /**
     * Appends and returns a new empty "AdministrativeArea" element
     */
    public oasisNamesTcCiqXal3.AddressType.AdministrativeArea addNewAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.AdministrativeArea target = null;
            target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea)get_store().add_element_user(ADMINISTRATIVEAREA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "AdministrativeArea" element
     */
    public void unsetAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINISTRATIVEAREA$4, 0);
        }
    }
    
    /**
     * Gets the "Locality" element
     */
    public oasisNamesTcCiqXal3.AddressType.Locality getLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Locality target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Locality)get_store().find_element_user(LOCALITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Locality" element
     */
    public boolean isSetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALITY$6) != 0;
        }
    }
    
    /**
     * Sets the "Locality" element
     */
    public void setLocality(oasisNamesTcCiqXal3.AddressType.Locality locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Locality target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Locality)get_store().find_element_user(LOCALITY$6, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.Locality)get_store().add_element_user(LOCALITY$6);
            }
            target.set(locality);
        }
    }
    
    /**
     * Appends and returns a new empty "Locality" element
     */
    public oasisNamesTcCiqXal3.AddressType.Locality addNewLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Locality target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Locality)get_store().add_element_user(LOCALITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Locality" element
     */
    public void unsetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALITY$6, 0);
        }
    }
    
    /**
     * Gets the "Thoroughfare" element
     */
    public oasisNamesTcCiqXal3.AddressType.Thoroughfare getThoroughfare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Thoroughfare target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare)get_store().find_element_user(THOROUGHFARE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Thoroughfare" element
     */
    public boolean isSetThoroughfare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THOROUGHFARE$8) != 0;
        }
    }
    
    /**
     * Sets the "Thoroughfare" element
     */
    public void setThoroughfare(oasisNamesTcCiqXal3.AddressType.Thoroughfare thoroughfare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Thoroughfare target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare)get_store().find_element_user(THOROUGHFARE$8, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare)get_store().add_element_user(THOROUGHFARE$8);
            }
            target.set(thoroughfare);
        }
    }
    
    /**
     * Appends and returns a new empty "Thoroughfare" element
     */
    public oasisNamesTcCiqXal3.AddressType.Thoroughfare addNewThoroughfare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Thoroughfare target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare)get_store().add_element_user(THOROUGHFARE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Thoroughfare" element
     */
    public void unsetThoroughfare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THOROUGHFARE$8, 0);
        }
    }
    
    /**
     * Gets the "Premises" element
     */
    public oasisNamesTcCiqXal3.AddressType.Premises getPremises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Premises target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Premises)get_store().find_element_user(PREMISES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Premises" element
     */
    public boolean isSetPremises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREMISES$10) != 0;
        }
    }
    
    /**
     * Sets the "Premises" element
     */
    public void setPremises(oasisNamesTcCiqXal3.AddressType.Premises premises)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Premises target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Premises)get_store().find_element_user(PREMISES$10, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.Premises)get_store().add_element_user(PREMISES$10);
            }
            target.set(premises);
        }
    }
    
    /**
     * Appends and returns a new empty "Premises" element
     */
    public oasisNamesTcCiqXal3.AddressType.Premises addNewPremises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.Premises target = null;
            target = (oasisNamesTcCiqXal3.AddressType.Premises)get_store().add_element_user(PREMISES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Premises" element
     */
    public void unsetPremises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREMISES$10, 0);
        }
    }
    
    /**
     * Gets the "PostCode" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostCode getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostCode target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostCode)get_store().find_element_user(POSTCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PostCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "PostCode" element
     */
    public void setPostCode(oasisNamesTcCiqXal3.AddressType.PostCode postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostCode target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostCode)get_store().find_element_user(POSTCODE$12, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.PostCode)get_store().add_element_user(POSTCODE$12);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Appends and returns a new empty "PostCode" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostCode addNewPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostCode target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostCode)get_store().add_element_user(POSTCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "PostCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$12, 0);
        }
    }
    
    /**
     * Gets the "RuralDelivery" element
     */
    public oasisNamesTcCiqXal3.AddressType.RuralDelivery getRuralDelivery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.RuralDelivery target = null;
            target = (oasisNamesTcCiqXal3.AddressType.RuralDelivery)get_store().find_element_user(RURALDELIVERY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RuralDelivery" element
     */
    public boolean isSetRuralDelivery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RURALDELIVERY$14) != 0;
        }
    }
    
    /**
     * Sets the "RuralDelivery" element
     */
    public void setRuralDelivery(oasisNamesTcCiqXal3.AddressType.RuralDelivery ruralDelivery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.RuralDelivery target = null;
            target = (oasisNamesTcCiqXal3.AddressType.RuralDelivery)get_store().find_element_user(RURALDELIVERY$14, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.RuralDelivery)get_store().add_element_user(RURALDELIVERY$14);
            }
            target.set(ruralDelivery);
        }
    }
    
    /**
     * Appends and returns a new empty "RuralDelivery" element
     */
    public oasisNamesTcCiqXal3.AddressType.RuralDelivery addNewRuralDelivery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.RuralDelivery target = null;
            target = (oasisNamesTcCiqXal3.AddressType.RuralDelivery)get_store().add_element_user(RURALDELIVERY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "RuralDelivery" element
     */
    public void unsetRuralDelivery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RURALDELIVERY$14, 0);
        }
    }
    
    /**
     * Gets the "PostalDeliveryPoint" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint getPostalDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint)get_store().find_element_user(POSTALDELIVERYPOINT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PostalDeliveryPoint" element
     */
    public boolean isSetPostalDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALDELIVERYPOINT$16) != 0;
        }
    }
    
    /**
     * Sets the "PostalDeliveryPoint" element
     */
    public void setPostalDeliveryPoint(oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint postalDeliveryPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint)get_store().find_element_user(POSTALDELIVERYPOINT$16, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint)get_store().add_element_user(POSTALDELIVERYPOINT$16);
            }
            target.set(postalDeliveryPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "PostalDeliveryPoint" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint addNewPostalDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint)get_store().add_element_user(POSTALDELIVERYPOINT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "PostalDeliveryPoint" element
     */
    public void unsetPostalDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALDELIVERYPOINT$16, 0);
        }
    }
    
    /**
     * Gets the "PostOffice" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostOffice getPostOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostOffice target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostOffice)get_store().find_element_user(POSTOFFICE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PostOffice" element
     */
    public boolean isSetPostOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTOFFICE$18) != 0;
        }
    }
    
    /**
     * Sets the "PostOffice" element
     */
    public void setPostOffice(oasisNamesTcCiqXal3.AddressType.PostOffice postOffice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostOffice target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostOffice)get_store().find_element_user(POSTOFFICE$18, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.PostOffice)get_store().add_element_user(POSTOFFICE$18);
            }
            target.set(postOffice);
        }
    }
    
    /**
     * Appends and returns a new empty "PostOffice" element
     */
    public oasisNamesTcCiqXal3.AddressType.PostOffice addNewPostOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.PostOffice target = null;
            target = (oasisNamesTcCiqXal3.AddressType.PostOffice)get_store().add_element_user(POSTOFFICE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "PostOffice" element
     */
    public void unsetPostOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTOFFICE$18, 0);
        }
    }
    
    /**
     * Gets the "GeoRSS" element
     */
    public oasisNamesTcCiqXal3.AddressType.GeoRSS getGeoRSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.GeoRSS target = null;
            target = (oasisNamesTcCiqXal3.AddressType.GeoRSS)get_store().find_element_user(GEORSS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GeoRSS" element
     */
    public boolean isSetGeoRSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEORSS$20) != 0;
        }
    }
    
    /**
     * Sets the "GeoRSS" element
     */
    public void setGeoRSS(oasisNamesTcCiqXal3.AddressType.GeoRSS geoRSS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.GeoRSS target = null;
            target = (oasisNamesTcCiqXal3.AddressType.GeoRSS)get_store().find_element_user(GEORSS$20, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.GeoRSS)get_store().add_element_user(GEORSS$20);
            }
            target.set(geoRSS);
        }
    }
    
    /**
     * Appends and returns a new empty "GeoRSS" element
     */
    public oasisNamesTcCiqXal3.AddressType.GeoRSS addNewGeoRSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.GeoRSS target = null;
            target = (oasisNamesTcCiqXal3.AddressType.GeoRSS)get_store().add_element_user(GEORSS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "GeoRSS" element
     */
    public void unsetGeoRSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEORSS$20, 0);
        }
    }
    
    /**
     * Gets the "LocationByCoordinates" element
     */
    public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates getLocationByCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.LocationByCoordinates target = null;
            target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates)get_store().find_element_user(LOCATIONBYCOORDINATES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationByCoordinates" element
     */
    public boolean isSetLocationByCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONBYCOORDINATES$22) != 0;
        }
    }
    
    /**
     * Sets the "LocationByCoordinates" element
     */
    public void setLocationByCoordinates(oasisNamesTcCiqXal3.AddressType.LocationByCoordinates locationByCoordinates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.LocationByCoordinates target = null;
            target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates)get_store().find_element_user(LOCATIONBYCOORDINATES$22, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates)get_store().add_element_user(LOCATIONBYCOORDINATES$22);
            }
            target.set(locationByCoordinates);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationByCoordinates" element
     */
    public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates addNewLocationByCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType.LocationByCoordinates target = null;
            target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates)get_store().add_element_user(LOCATIONBYCOORDINATES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationByCoordinates" element
     */
    public void unsetLocationByCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONBYCOORDINATES$22, 0);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public oasisNamesTcCiqXal3.AddressTypeList.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqXal3.AddressTypeList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public oasisNamesTcCiqXal3.AddressTypeList xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressTypeList target = null;
            target = (oasisNamesTcCiqXal3.AddressTypeList)get_store().find_attribute_user(TYPE$24);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$24) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(oasisNamesTcCiqXal3.AddressTypeList.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$24);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(oasisNamesTcCiqXal3.AddressTypeList type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressTypeList target = null;
            target = (oasisNamesTcCiqXal3.AddressTypeList)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressTypeList)get_store().add_attribute_user(TYPE$24);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$24);
        }
    }
    
    /**
     * Gets the "AddressID" attribute
     */
    public java.lang.String getAddressID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSID$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetAddressID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSID$26);
            return target;
        }
    }
    
    /**
     * True if has "AddressID" attribute
     */
    public boolean isSetAddressID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSID$26) != null;
        }
    }
    
    /**
     * Sets the "AddressID" attribute
     */
    public void setAddressID(java.lang.String addressID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSID$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSID$26);
            }
            target.setStringValue(addressID);
        }
    }
    
    /**
     * Sets (as xml) the "AddressID" attribute
     */
    public void xsetAddressID(oasisNamesTcCiqCt3.String addressID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSID$26);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ADDRESSID$26);
            }
            target.set(addressID);
        }
    }
    
    /**
     * Unsets the "AddressID" attribute
     */
    public void unsetAddressID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSID$26);
        }
    }
    
    /**
     * Gets the "AddressIDType" attribute
     */
    public java.lang.String getAddressIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSIDTYPE$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressIDType" attribute
     */
    public oasisNamesTcCiqXal3.AddressIDTypeList xgetAddressIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressIDTypeList target = null;
            target = (oasisNamesTcCiqXal3.AddressIDTypeList)get_store().find_attribute_user(ADDRESSIDTYPE$28);
            return target;
        }
    }
    
    /**
     * True if has "AddressIDType" attribute
     */
    public boolean isSetAddressIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSIDTYPE$28) != null;
        }
    }
    
    /**
     * Sets the "AddressIDType" attribute
     */
    public void setAddressIDType(java.lang.String addressIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSIDTYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSIDTYPE$28);
            }
            target.setStringValue(addressIDType);
        }
    }
    
    /**
     * Sets (as xml) the "AddressIDType" attribute
     */
    public void xsetAddressIDType(oasisNamesTcCiqXal3.AddressIDTypeList addressIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressIDTypeList target = null;
            target = (oasisNamesTcCiqXal3.AddressIDTypeList)get_store().find_attribute_user(ADDRESSIDTYPE$28);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressIDTypeList)get_store().add_attribute_user(ADDRESSIDTYPE$28);
            }
            target.set(addressIDType);
        }
    }
    
    /**
     * Unsets the "AddressIDType" attribute
     */
    public void unsetAddressIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSIDTYPE$28);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$30);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$30) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$30);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(oasisNamesTcCiqCt3.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ID$30);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$30);
        }
    }
    
    /**
     * Gets the "Usage" attribute
     */
    public oasisNamesTcCiqXal3.AddressUsageList.Enum getUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$32);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqXal3.AddressUsageList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    public oasisNamesTcCiqXal3.AddressUsageList xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressUsageList target = null;
            target = (oasisNamesTcCiqXal3.AddressUsageList)get_store().find_attribute_user(USAGE$32);
            return target;
        }
    }
    
    /**
     * True if has "Usage" attribute
     */
    public boolean isSetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USAGE$32) != null;
        }
    }
    
    /**
     * Sets the "Usage" attribute
     */
    public void setUsage(oasisNamesTcCiqXal3.AddressUsageList.Enum usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$32);
            }
            target.setEnumValue(usage);
        }
    }
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    public void xsetUsage(oasisNamesTcCiqXal3.AddressUsageList usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressUsageList target = null;
            target = (oasisNamesTcCiqXal3.AddressUsageList)get_store().find_attribute_user(USAGE$32);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressUsageList)get_store().add_attribute_user(USAGE$32);
            }
            target.set(usage);
        }
    }
    
    /**
     * Unsets the "Usage" attribute
     */
    public void unsetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USAGE$32);
        }
    }
    
    /**
     * Gets the "DeliveryMode" attribute
     */
    public java.lang.String getDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYMODE$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryMode" attribute
     */
    public oasisNamesTcCiqXal3.DeliveryModeList xgetDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.DeliveryModeList target = null;
            target = (oasisNamesTcCiqXal3.DeliveryModeList)get_store().find_attribute_user(DELIVERYMODE$34);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryMode" attribute
     */
    public boolean isSetDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELIVERYMODE$34) != null;
        }
    }
    
    /**
     * Sets the "DeliveryMode" attribute
     */
    public void setDeliveryMode(java.lang.String deliveryMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYMODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIVERYMODE$34);
            }
            target.setStringValue(deliveryMode);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryMode" attribute
     */
    public void xsetDeliveryMode(oasisNamesTcCiqXal3.DeliveryModeList deliveryMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.DeliveryModeList target = null;
            target = (oasisNamesTcCiqXal3.DeliveryModeList)get_store().find_attribute_user(DELIVERYMODE$34);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.DeliveryModeList)get_store().add_attribute_user(DELIVERYMODE$34);
            }
            target.set(deliveryMode);
        }
    }
    
    /**
     * Unsets the "DeliveryMode" attribute
     */
    public void unsetDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELIVERYMODE$34);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public oasisNamesTcCiqCt3.StatusList xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.StatusList target = null;
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$36);
            return target;
        }
    }
    
    /**
     * True if has "Status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$36) != null;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$36);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(oasisNamesTcCiqCt3.StatusList status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.StatusList target = null;
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$36);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$36);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$36);
        }
    }
    
    /**
     * Gets the "DateValidFrom" attribute
     */
    public java.util.Calendar getDateValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$38);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateValidFrom" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$38);
            return target;
        }
    }
    
    /**
     * True if has "DateValidFrom" attribute
     */
    public boolean isSetDateValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEVALIDFROM$38) != null;
        }
    }
    
    /**
     * Sets the "DateValidFrom" attribute
     */
    public void setDateValidFrom(java.util.Calendar dateValidFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$38);
            }
            target.setCalendarValue(dateValidFrom);
        }
    }
    
    /**
     * Sets (as xml) the "DateValidFrom" attribute
     */
    public void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$38);
            }
            target.set(dateValidFrom);
        }
    }
    
    /**
     * Unsets the "DateValidFrom" attribute
     */
    public void unsetDateValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEVALIDFROM$38);
        }
    }
    
    /**
     * Gets the "DateValidTo" attribute
     */
    public java.util.Calendar getDateValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$40);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateValidTo" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$40);
            return target;
        }
    }
    
    /**
     * True if has "DateValidTo" attribute
     */
    public boolean isSetDateValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEVALIDTO$40) != null;
        }
    }
    
    /**
     * Sets the "DateValidTo" attribute
     */
    public void setDateValidTo(java.util.Calendar dateValidTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$40);
            }
            target.setCalendarValue(dateValidTo);
        }
    }
    
    /**
     * Sets (as xml) the "DateValidTo" attribute
     */
    public void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$40);
            }
            target.set(dateValidTo);
        }
    }
    
    /**
     * Unsets the "DateValidTo" attribute
     */
    public void unsetDateValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEVALIDTO$40);
        }
    }
    
    /**
     * Gets the "AddressKey" attribute
     */
    public java.lang.String getAddressKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSKEY$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressKey" attribute
     */
    public oasisNamesTcCiqCt3.String xgetAddressKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSKEY$42);
            return target;
        }
    }
    
    /**
     * True if has "AddressKey" attribute
     */
    public boolean isSetAddressKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSKEY$42) != null;
        }
    }
    
    /**
     * Sets the "AddressKey" attribute
     */
    public void setAddressKey(java.lang.String addressKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSKEY$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSKEY$42);
            }
            target.setStringValue(addressKey);
        }
    }
    
    /**
     * Sets (as xml) the "AddressKey" attribute
     */
    public void xsetAddressKey(oasisNamesTcCiqCt3.String addressKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSKEY$42);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ADDRESSKEY$42);
            }
            target.set(addressKey);
        }
    }
    
    /**
     * Unsets the "AddressKey" attribute
     */
    public void unsetAddressKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSKEY$42);
        }
    }
    
    /**
     * Gets the "AddressKeyRef" attribute
     */
    public java.lang.String getAddressKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSKEYREF$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressKeyRef" attribute
     */
    public oasisNamesTcCiqCt3.String xgetAddressKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSKEYREF$44);
            return target;
        }
    }
    
    /**
     * True if has "AddressKeyRef" attribute
     */
    public boolean isSetAddressKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSKEYREF$44) != null;
        }
    }
    
    /**
     * Sets the "AddressKeyRef" attribute
     */
    public void setAddressKeyRef(java.lang.String addressKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSKEYREF$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSKEYREF$44);
            }
            target.setStringValue(addressKeyRef);
        }
    }
    
    /**
     * Sets (as xml) the "AddressKeyRef" attribute
     */
    public void xsetAddressKeyRef(oasisNamesTcCiqCt3.String addressKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ADDRESSKEYREF$44);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ADDRESSKEYREF$44);
            }
            target.set(addressKeyRef);
        }
    }
    
    /**
     * Unsets the "AddressKeyRef" attribute
     */
    public void unsetAddressKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSKEYREF$44);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$46);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink1.TypeAttribute.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type xgetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$46);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE2$46) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType2(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE2$46);
            }
            target.setEnumValue(type2);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType2(org.w3.x1999.xlink1.TypeAttribute.Type type2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$46);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE2$46);
            }
            target.set(type2);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE2$46);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$48);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$48) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$48);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlNCName label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LABEL$48);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$48);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$50);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$50) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$50);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$50);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$50);
        }
    }
    
    /**
     * Gets the "DataQualityType" attribute
     */
    public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$52);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataQualityType" attribute
     */
    public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.DataQualityTypeList target = null;
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$52);
            return target;
        }
    }
    
    /**
     * True if has "DataQualityType" attribute
     */
    public boolean isSetDataQualityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAQUALITYTYPE$52) != null;
        }
    }
    
    /**
     * Sets the "DataQualityType" attribute
     */
    public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$52);
            }
            target.setEnumValue(dataQualityType);
        }
    }
    
    /**
     * Sets (as xml) the "DataQualityType" attribute
     */
    public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.DataQualityTypeList target = null;
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$52);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$52);
            }
            target.set(dataQualityType);
        }
    }
    
    /**
     * Unsets the "DataQualityType" attribute
     */
    public void unsetDataQualityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAQUALITYTYPE$52);
        }
    }
    
    /**
     * Gets the "ValidFrom" attribute
     */
    public java.util.Calendar getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$54);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidFrom" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$54);
            return target;
        }
    }
    
    /**
     * True if has "ValidFrom" attribute
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROM$54) != null;
        }
    }
    
    /**
     * Sets the "ValidFrom" attribute
     */
    public void setValidFrom(java.util.Calendar validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$54);
            }
            target.setCalendarValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "ValidFrom" attribute
     */
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$54);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "ValidFrom" attribute
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROM$54);
        }
    }
    
    /**
     * Gets the "ValidTo" attribute
     */
    public java.util.Calendar getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$56);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidTo" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$56);
            return target;
        }
    }
    
    /**
     * True if has "ValidTo" attribute
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTO$56) != null;
        }
    }
    
    /**
     * Sets the "ValidTo" attribute
     */
    public void setValidTo(java.util.Calendar validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$56);
            }
            target.setCalendarValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "ValidTo" attribute
     */
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$56);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "ValidTo" attribute
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTO$56);
        }
    }
    
    /**
     * Gets the "LanguageCode" attribute
     */
    public java.lang.String getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LanguageCode" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$58);
            return target;
        }
    }
    
    /**
     * True if has "LanguageCode" attribute
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGECODE$58) != null;
        }
    }
    
    /**
     * Sets the "LanguageCode" attribute
     */
    public void setLanguageCode(java.lang.String languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$58);
            }
            target.setStringValue(languageCode);
        }
    }
    
    /**
     * Sets (as xml) the "LanguageCode" attribute
     */
    public void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$58);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Unsets the "LanguageCode" attribute
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGECODE$58);
        }
    }
    /**
     * An XML FreeTextAddress(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class FreeTextAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.FreeTextAddress
    {
        private static final long serialVersionUID = 1L;
        
        public FreeTextAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESSLINE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "AddressLine");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "AddressLine" elements
         */
        public oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine[] getAddressLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESSLINE$0, targetList);
                oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine[] result = new oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AddressLine" element
         */
        public oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine getAddressLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine target = null;
                target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine)get_store().find_element_user(ADDRESSLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AddressLine" element
         */
        public int sizeOfAddressLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSLINE$0);
            }
        }
        
        /**
         * Sets array of all "AddressLine" element
         */
        public void setAddressLineArray(oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine[] addressLineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addressLineArray, ADDRESSLINE$0);
            }
        }
        
        /**
         * Sets ith "AddressLine" element
         */
        public void setAddressLineArray(int i, oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine addressLine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine target = null;
                target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine)get_store().find_element_user(ADDRESSLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(addressLine);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AddressLine" element
         */
        public oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine insertNewAddressLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine target = null;
                target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine)get_store().insert_element_user(ADDRESSLINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AddressLine" element
         */
        public oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine addNewAddressLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine target = null;
                target = (oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine)get_store().add_element_user(ADDRESSLINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AddressLine" element
         */
        public void removeAddressLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSLINE$0, i);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$2);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$4) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$4);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$6) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$6);
            }
        }
        /**
         * An XML AddressLine(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressType$FreeTextAddress$AddressLine.
         */
        public static class AddressLineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.AddressType.FreeTextAddress.AddressLine
        {
            private static final long serialVersionUID = 1L;
            
            public AddressLineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AddressLineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXal3.AddressLineTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressLineTypeList target = null;
                    target = (oasisNamesTcCiqXal3.AddressLineTypeList)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * True if has "Type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$0) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXal3.AddressLineTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressLineTypeList target = null;
                    target = (oasisNamesTcCiqXal3.AddressLineTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.AddressLineTypeList)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "Type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$0);
                }
            }
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "DataQualityType" attribute
             */
            public boolean isSetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
                }
            }
            
            /**
             * Sets the "DataQualityType" attribute
             */
            public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                    }
                    target.setEnumValue(dataQualityType);
                }
            }
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                    }
                    target.set(dataQualityType);
                }
            }
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            public void unsetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATAQUALITYTYPE$2);
                }
            }
            
            /**
             * Gets the "ValidFrom" attribute
             */
            public java.util.Calendar getValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                    return target;
                }
            }
            
            /**
             * True if has "ValidFrom" attribute
             */
            public boolean isSetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDFROM$4) != null;
                }
            }
            
            /**
             * Sets the "ValidFrom" attribute
             */
            public void setValidFrom(java.util.Calendar validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
                    }
                    target.setCalendarValue(validFrom);
                }
            }
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
                    }
                    target.set(validFrom);
                }
            }
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            public void unsetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDFROM$4);
                }
            }
            
            /**
             * Gets the "ValidTo" attribute
             */
            public java.util.Calendar getValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                    return target;
                }
            }
            
            /**
             * True if has "ValidTo" attribute
             */
            public boolean isSetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDTO$6) != null;
                }
            }
            
            /**
             * Sets the "ValidTo" attribute
             */
            public void setValidTo(java.util.Calendar validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
                    }
                    target.setCalendarValue(validTo);
                }
            }
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
                    }
                    target.set(validTo);
                }
            }
            
            /**
             * Unsets the "ValidTo" attribute
             */
            public void unsetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDTO$6);
                }
            }
        }
    }
    /**
     * An XML Country(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class CountryImpl extends oasisNamesTcCiqXal3.impl.CountryTypeImpl implements oasisNamesTcCiqXal3.AddressType.Country
    {
        private static final long serialVersionUID = 1L;
        
        public CountryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML AdministrativeArea(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class AdministrativeAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.AdministrativeArea
    {
        private static final long serialVersionUID = 1L;
        
        public AdministrativeAreaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
        private static final javax.xml.namespace.QName SUBADMINISTRATIVEAREA$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SubAdministrativeArea");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "NameElement" elements
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement[] getNameElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMEELEMENT$0, targetList);
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement[] result = new oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement getNameElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "NameElement" element
         */
        public int sizeOfNameElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMEELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "NameElement" element
         */
        public void setNameElementArray(oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement[] nameElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameElementArray, NAMEELEMENT$0);
            }
        }
        
        /**
         * Sets ith "NameElement" element
         */
        public void setNameElementArray(int i, oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement nameElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(nameElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement insertNewNameElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement addNewNameElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement)get_store().add_element_user(NAMEELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "NameElement" element
         */
        public void removeNameElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMEELEMENT$0, i);
            }
        }
        
        /**
         * Gets the "SubAdministrativeArea" element
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea getSubAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea)get_store().find_element_user(SUBADMINISTRATIVEAREA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SubAdministrativeArea" element
         */
        public boolean isSetSubAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBADMINISTRATIVEAREA$2) != 0;
            }
        }
        
        /**
         * Sets the "SubAdministrativeArea" element
         */
        public void setSubAdministrativeArea(oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea subAdministrativeArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea)get_store().find_element_user(SUBADMINISTRATIVEAREA$2, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea)get_store().add_element_user(SUBADMINISTRATIVEAREA$2);
                }
                target.set(subAdministrativeArea);
            }
        }
        
        /**
         * Appends and returns a new empty "SubAdministrativeArea" element
         */
        public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea addNewSubAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea target = null;
                target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea)get_store().add_element_user(SUBADMINISTRATIVEAREA$2);
                return target;
            }
        }
        
        /**
         * Unsets the "SubAdministrativeArea" element
         */
        public void unsetSubAdministrativeArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBADMINISTRATIVEAREA$2, 0);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public oasisNamesTcCiqXal3.AdministrativeAreaTypeList.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXal3.AdministrativeAreaTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.AdministrativeAreaTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AdministrativeAreaTypeList target = null;
                target = (oasisNamesTcCiqXal3.AdministrativeAreaTypeList)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$4) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(oasisNamesTcCiqXal3.AdministrativeAreaTypeList.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.AdministrativeAreaTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AdministrativeAreaTypeList target = null;
                target = (oasisNamesTcCiqXal3.AdministrativeAreaTypeList)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AdministrativeAreaTypeList)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$4);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$6);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$6);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$6);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$8);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$8) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$8);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$8);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$8);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$10);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$10) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$10);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$10);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$10);
            }
        }
        /**
         * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressType$AdministrativeArea$NameElement.
         */
        public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.AddressType.AdministrativeArea.NameElement
        {
            private static final long serialVersionUID = 1L;
            
            public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName ABBREVIATION$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
            private static final javax.xml.namespace.QName NAMETYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameType");
            private static final javax.xml.namespace.QName NAMECODE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCode");
            private static final javax.xml.namespace.QName NAMECODETYPE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCodeType");
            
            
            /**
             * Gets the "Abbreviation" attribute
             */
            public boolean getAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Abbreviation" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                    return target;
                }
            }
            
            /**
             * True if has "Abbreviation" attribute
             */
            public boolean isSetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ABBREVIATION$0) != null;
                }
            }
            
            /**
             * Sets the "Abbreviation" attribute
             */
            public void setAbbreviation(boolean abbreviation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
                    }
                    target.setBooleanValue(abbreviation);
                }
            }
            
            /**
             * Sets (as xml) the "Abbreviation" attribute
             */
            public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
                    }
                    target.set(abbreviation);
                }
            }
            
            /**
             * Unsets the "Abbreviation" attribute
             */
            public void unsetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ABBREVIATION$0);
                }
            }
            
            /**
             * Gets the "NameType" attribute
             */
            public oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList.Enum getNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameType" attribute
             */
            public oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList xgetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList target = null;
                    target = (oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "NameType" attribute
             */
            public boolean isSetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMETYPE$2) != null;
                }
            }
            
            /**
             * Sets the "NameType" attribute
             */
            public void setNameType(oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList.Enum nameType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$2);
                    }
                    target.setEnumValue(nameType);
                }
            }
            
            /**
             * Sets (as xml) the "NameType" attribute
             */
            public void xsetNameType(oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList nameType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList target = null;
                    target = (oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.AdministrativeAreaNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
                    }
                    target.set(nameType);
                }
            }
            
            /**
             * Unsets the "NameType" attribute
             */
            public void unsetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMETYPE$2);
                }
            }
            
            /**
             * Gets the "NameCode" attribute
             */
            public java.lang.String getNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameCode" attribute
             */
            public oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList xgetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList target = null;
                    target = (oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                    return target;
                }
            }
            
            /**
             * True if has "NameCode" attribute
             */
            public boolean isSetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMECODE$4) != null;
                }
            }
            
            /**
             * Sets the "NameCode" attribute
             */
            public void setNameCode(java.lang.String nameCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODE$4);
                    }
                    target.setStringValue(nameCode);
                }
            }
            
            /**
             * Sets (as xml) the "NameCode" attribute
             */
            public void xsetNameCode(oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList nameCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList target = null;
                    target = (oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.AdministrativeAreaNameCodeList)get_store().add_attribute_user(NAMECODE$4);
                    }
                    target.set(nameCode);
                }
            }
            
            /**
             * Unsets the "NameCode" attribute
             */
            public void unsetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMECODE$4);
                }
            }
            
            /**
             * Gets the "NameCodeType" attribute
             */
            public java.lang.String getNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameCodeType" attribute
             */
            public oasisNamesTcCiqCt3.String xgetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                    return target;
                }
            }
            
            /**
             * True if has "NameCodeType" attribute
             */
            public boolean isSetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMECODETYPE$6) != null;
                }
            }
            
            /**
             * Sets the "NameCodeType" attribute
             */
            public void setNameCodeType(java.lang.String nameCodeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODETYPE$6);
                    }
                    target.setStringValue(nameCodeType);
                }
            }
            
            /**
             * Sets (as xml) the "NameCodeType" attribute
             */
            public void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMECODETYPE$6);
                    }
                    target.set(nameCodeType);
                }
            }
            
            /**
             * Unsets the "NameCodeType" attribute
             */
            public void unsetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMECODETYPE$6);
                }
            }
        }
        /**
         * An XML SubAdministrativeArea(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class SubAdministrativeAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea
        {
            private static final long serialVersionUID = 1L;
            
            public SubAdministrativeAreaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
            private static final javax.xml.namespace.QName TYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "NameElement" elements
             */
            public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement[] getNameElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NAMEELEMENT$0, targetList);
                    oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement[] result = new oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement getNameElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "NameElement" element
             */
            public int sizeOfNameElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAMEELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "NameElement" element
             */
            public void setNameElementArray(oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement[] nameElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(nameElementArray, NAMEELEMENT$0);
                }
            }
            
            /**
             * Sets ith "NameElement" element
             */
            public void setNameElementArray(int i, oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement nameElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(nameElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement insertNewNameElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement addNewNameElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement)get_store().add_element_user(NAMEELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "NameElement" element
             */
            public void removeNameElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAMEELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList)get_store().find_attribute_user(TYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "Type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$2) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList)get_store().add_attribute_user(TYPE$2);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "Type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$2);
                }
            }
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    return target;
                }
            }
            
            /**
             * True if has "DataQualityType" attribute
             */
            public boolean isSetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
                }
            }
            
            /**
             * Sets the "DataQualityType" attribute
             */
            public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                    }
                    target.setEnumValue(dataQualityType);
                }
            }
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                    }
                    target.set(dataQualityType);
                }
            }
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            public void unsetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATAQUALITYTYPE$4);
                }
            }
            
            /**
             * Gets the "ValidFrom" attribute
             */
            public java.util.Calendar getValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    return target;
                }
            }
            
            /**
             * True if has "ValidFrom" attribute
             */
            public boolean isSetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDFROM$6) != null;
                }
            }
            
            /**
             * Sets the "ValidFrom" attribute
             */
            public void setValidFrom(java.util.Calendar validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
                    }
                    target.setCalendarValue(validFrom);
                }
            }
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
                    }
                    target.set(validFrom);
                }
            }
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            public void unsetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDFROM$6);
                }
            }
            
            /**
             * Gets the "ValidTo" attribute
             */
            public java.util.Calendar getValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    return target;
                }
            }
            
            /**
             * True if has "ValidTo" attribute
             */
            public boolean isSetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDTO$8) != null;
                }
            }
            
            /**
             * Sets the "ValidTo" attribute
             */
            public void setValidTo(java.util.Calendar validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
                    }
                    target.setCalendarValue(validTo);
                }
            }
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
                    }
                    target.set(validTo);
                }
            }
            
            /**
             * Unsets the "ValidTo" attribute
             */
            public void unsetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDTO$8);
                }
            }
            /**
             * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressType$AdministrativeArea$SubAdministrativeArea$NameElement.
             */
            public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.AddressType.AdministrativeArea.SubAdministrativeArea.NameElement
            {
                private static final long serialVersionUID = 1L;
                
                public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName ABBREVIATION$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
                private static final javax.xml.namespace.QName NAMETYPE$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameType");
                private static final javax.xml.namespace.QName NAMECODE$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCode");
                private static final javax.xml.namespace.QName NAMECODETYPE$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCodeType");
                
                
                /**
                 * Gets the "Abbreviation" attribute
                 */
                public boolean getAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Abbreviation" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Abbreviation" attribute
                 */
                public boolean isSetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ABBREVIATION$0) != null;
                    }
                }
                
                /**
                 * Sets the "Abbreviation" attribute
                 */
                public void setAbbreviation(boolean abbreviation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
                      }
                      target.setBooleanValue(abbreviation);
                    }
                }
                
                /**
                 * Sets (as xml) the "Abbreviation" attribute
                 */
                public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
                      }
                      target.set(abbreviation);
                    }
                }
                
                /**
                 * Unsets the "Abbreviation" attribute
                 */
                public void unsetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ABBREVIATION$0);
                    }
                }
                
                /**
                 * Gets the "NameType" attribute
                 */
                public oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList.Enum getNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return (oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameType" attribute
                 */
                public oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList xgetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList target = null;
                      target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameType" attribute
                 */
                public boolean isSetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMETYPE$2) != null;
                    }
                }
                
                /**
                 * Sets the "NameType" attribute
                 */
                public void setNameType(oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList.Enum nameType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$2);
                      }
                      target.setEnumValue(nameType);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameType" attribute
                 */
                public void xsetNameType(oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList nameType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList target = null;
                      target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
                      }
                      target.set(nameType);
                    }
                }
                
                /**
                 * Unsets the "NameType" attribute
                 */
                public void unsetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMETYPE$2);
                    }
                }
                
                /**
                 * Gets the "NameCode" attribute
                 */
                public java.lang.String getNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameCode" attribute
                 */
                public oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList xgetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList target = null;
                      target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameCode" attribute
                 */
                public boolean isSetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMECODE$4) != null;
                    }
                }
                
                /**
                 * Sets the "NameCode" attribute
                 */
                public void setNameCode(java.lang.String nameCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODE$4);
                      }
                      target.setStringValue(nameCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameCode" attribute
                 */
                public void xsetNameCode(oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList nameCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList target = null;
                      target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXal3.SubAdministrativeAreaNameCodeList)get_store().add_attribute_user(NAMECODE$4);
                      }
                      target.set(nameCode);
                    }
                }
                
                /**
                 * Unsets the "NameCode" attribute
                 */
                public void unsetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMECODE$4);
                    }
                }
                
                /**
                 * Gets the "NameCodeType" attribute
                 */
                public java.lang.String getNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameCodeType" attribute
                 */
                public oasisNamesTcCiqCt3.String xgetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqCt3.String target = null;
                      target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameCodeType" attribute
                 */
                public boolean isSetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMECODETYPE$6) != null;
                    }
                }
                
                /**
                 * Sets the "NameCodeType" attribute
                 */
                public void setNameCodeType(java.lang.String nameCodeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODETYPE$6);
                      }
                      target.setStringValue(nameCodeType);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameCodeType" attribute
                 */
                public void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqCt3.String target = null;
                      target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMECODETYPE$6);
                      }
                      target.set(nameCodeType);
                    }
                }
                
                /**
                 * Unsets the "NameCodeType" attribute
                 */
                public void unsetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMECODETYPE$6);
                    }
                }
            }
        }
    }
    /**
     * An XML Locality(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class LocalityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.Locality
    {
        private static final long serialVersionUID = 1L;
        
        public LocalityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
        private static final javax.xml.namespace.QName SUBLOCALITY$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SubLocality");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "NameElement" elements
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.NameElement[] getNameElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMEELEMENT$0, targetList);
                oasisNamesTcCiqXal3.AddressType.Locality.NameElement[] result = new oasisNamesTcCiqXal3.AddressType.Locality.NameElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.NameElement getNameElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "NameElement" element
         */
        public int sizeOfNameElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMEELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "NameElement" element
         */
        public void setNameElementArray(oasisNamesTcCiqXal3.AddressType.Locality.NameElement[] nameElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameElementArray, NAMEELEMENT$0);
            }
        }
        
        /**
         * Sets ith "NameElement" element
         */
        public void setNameElementArray(int i, oasisNamesTcCiqXal3.AddressType.Locality.NameElement nameElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(nameElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.NameElement insertNewNameElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NameElement" element
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.NameElement addNewNameElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.NameElement target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.NameElement)get_store().add_element_user(NAMEELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "NameElement" element
         */
        public void removeNameElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMEELEMENT$0, i);
            }
        }
        
        /**
         * Gets the "SubLocality" element
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality getSubLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.SubLocality target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality)get_store().find_element_user(SUBLOCALITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SubLocality" element
         */
        public boolean isSetSubLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBLOCALITY$2) != 0;
            }
        }
        
        /**
         * Sets the "SubLocality" element
         */
        public void setSubLocality(oasisNamesTcCiqXal3.AddressType.Locality.SubLocality subLocality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.SubLocality target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality)get_store().find_element_user(SUBLOCALITY$2, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality)get_store().add_element_user(SUBLOCALITY$2);
                }
                target.set(subLocality);
            }
        }
        
        /**
         * Appends and returns a new empty "SubLocality" element
         */
        public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality addNewSubLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Locality.SubLocality target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality)get_store().add_element_user(SUBLOCALITY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "SubLocality" element
         */
        public void unsetSubLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBLOCALITY$2, 0);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public oasisNamesTcCiqXal3.LocalityTypeList.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXal3.LocalityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.LocalityTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.LocalityTypeList target = null;
                target = (oasisNamesTcCiqXal3.LocalityTypeList)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$4) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(oasisNamesTcCiqXal3.LocalityTypeList.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.LocalityTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.LocalityTypeList target = null;
                target = (oasisNamesTcCiqXal3.LocalityTypeList)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.LocalityTypeList)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$4);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$6);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$6);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$6);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$8);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$8) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$8);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$8);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$8);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$10);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$10) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$10);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$10);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$10);
            }
        }
        /**
         * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressType$Locality$NameElement.
         */
        public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.AddressType.Locality.NameElement
        {
            private static final long serialVersionUID = 1L;
            
            public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName ABBREVIATION$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
            private static final javax.xml.namespace.QName NAMETYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameType");
            private static final javax.xml.namespace.QName NAMECODE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCode");
            private static final javax.xml.namespace.QName NAMECODETYPE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCodeType");
            
            
            /**
             * Gets the "Abbreviation" attribute
             */
            public boolean getAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Abbreviation" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                    return target;
                }
            }
            
            /**
             * True if has "Abbreviation" attribute
             */
            public boolean isSetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ABBREVIATION$0) != null;
                }
            }
            
            /**
             * Sets the "Abbreviation" attribute
             */
            public void setAbbreviation(boolean abbreviation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
                    }
                    target.setBooleanValue(abbreviation);
                }
            }
            
            /**
             * Sets (as xml) the "Abbreviation" attribute
             */
            public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
                    }
                    target.set(abbreviation);
                }
            }
            
            /**
             * Unsets the "Abbreviation" attribute
             */
            public void unsetAbbreviation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ABBREVIATION$0);
                }
            }
            
            /**
             * Gets the "NameType" attribute
             */
            public oasisNamesTcCiqXal3.LocalityNameTypeList.Enum getNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.LocalityNameTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameType" attribute
             */
            public oasisNamesTcCiqXal3.LocalityNameTypeList xgetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.LocalityNameTypeList target = null;
                    target = (oasisNamesTcCiqXal3.LocalityNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "NameType" attribute
             */
            public boolean isSetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMETYPE$2) != null;
                }
            }
            
            /**
             * Sets the "NameType" attribute
             */
            public void setNameType(oasisNamesTcCiqXal3.LocalityNameTypeList.Enum nameType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$2);
                    }
                    target.setEnumValue(nameType);
                }
            }
            
            /**
             * Sets (as xml) the "NameType" attribute
             */
            public void xsetNameType(oasisNamesTcCiqXal3.LocalityNameTypeList nameType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.LocalityNameTypeList target = null;
                    target = (oasisNamesTcCiqXal3.LocalityNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.LocalityNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
                    }
                    target.set(nameType);
                }
            }
            
            /**
             * Unsets the "NameType" attribute
             */
            public void unsetNameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMETYPE$2);
                }
            }
            
            /**
             * Gets the "NameCode" attribute
             */
            public java.lang.String getNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameCode" attribute
             */
            public oasisNamesTcCiqXal3.LocalityNameCodeList xgetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.LocalityNameCodeList target = null;
                    target = (oasisNamesTcCiqXal3.LocalityNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                    return target;
                }
            }
            
            /**
             * True if has "NameCode" attribute
             */
            public boolean isSetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMECODE$4) != null;
                }
            }
            
            /**
             * Sets the "NameCode" attribute
             */
            public void setNameCode(java.lang.String nameCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODE$4);
                    }
                    target.setStringValue(nameCode);
                }
            }
            
            /**
             * Sets (as xml) the "NameCode" attribute
             */
            public void xsetNameCode(oasisNamesTcCiqXal3.LocalityNameCodeList nameCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.LocalityNameCodeList target = null;
                    target = (oasisNamesTcCiqXal3.LocalityNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.LocalityNameCodeList)get_store().add_attribute_user(NAMECODE$4);
                    }
                    target.set(nameCode);
                }
            }
            
            /**
             * Unsets the "NameCode" attribute
             */
            public void unsetNameCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMECODE$4);
                }
            }
            
            /**
             * Gets the "NameCodeType" attribute
             */
            public java.lang.String getNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NameCodeType" attribute
             */
            public oasisNamesTcCiqCt3.String xgetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                    return target;
                }
            }
            
            /**
             * True if has "NameCodeType" attribute
             */
            public boolean isSetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAMECODETYPE$6) != null;
                }
            }
            
            /**
             * Sets the "NameCodeType" attribute
             */
            public void setNameCodeType(java.lang.String nameCodeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODETYPE$6);
                    }
                    target.setStringValue(nameCodeType);
                }
            }
            
            /**
             * Sets (as xml) the "NameCodeType" attribute
             */
            public void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMECODETYPE$6);
                    }
                    target.set(nameCodeType);
                }
            }
            
            /**
             * Unsets the "NameCodeType" attribute
             */
            public void unsetNameCodeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAMECODETYPE$6);
                }
            }
        }
        /**
         * An XML SubLocality(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class SubLocalityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.Locality.SubLocality
        {
            private static final long serialVersionUID = 1L;
            
            public SubLocalityImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
            private static final javax.xml.namespace.QName TYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "NameElement" elements
             */
            public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement[] getNameElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NAMEELEMENT$0, targetList);
                    oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement[] result = new oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement getNameElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "NameElement" element
             */
            public int sizeOfNameElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAMEELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "NameElement" element
             */
            public void setNameElementArray(oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement[] nameElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(nameElementArray, NAMEELEMENT$0);
                }
            }
            
            /**
             * Sets ith "NameElement" element
             */
            public void setNameElementArray(int i, oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement nameElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(nameElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement insertNewNameElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NameElement" element
             */
            public oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement addNewNameElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement target = null;
                    target = (oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement)get_store().add_element_user(NAMEELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "NameElement" element
             */
            public void removeNameElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAMEELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubLocalityTypeList.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.SubLocalityTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubLocalityTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubLocalityTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubLocalityTypeList)get_store().find_attribute_user(TYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "Type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$2) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(oasisNamesTcCiqXal3.SubLocalityTypeList.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXal3.SubLocalityTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubLocalityTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubLocalityTypeList)get_store().find_attribute_user(TYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.SubLocalityTypeList)get_store().add_attribute_user(TYPE$2);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "Type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$2);
                }
            }
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    return target;
                }
            }
            
            /**
             * True if has "DataQualityType" attribute
             */
            public boolean isSetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
                }
            }
            
            /**
             * Sets the "DataQualityType" attribute
             */
            public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                    }
                    target.setEnumValue(dataQualityType);
                }
            }
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                    }
                    target.set(dataQualityType);
                }
            }
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            public void unsetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATAQUALITYTYPE$4);
                }
            }
            
            /**
             * Gets the "ValidFrom" attribute
             */
            public java.util.Calendar getValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    return target;
                }
            }
            
            /**
             * True if has "ValidFrom" attribute
             */
            public boolean isSetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDFROM$6) != null;
                }
            }
            
            /**
             * Sets the "ValidFrom" attribute
             */
            public void setValidFrom(java.util.Calendar validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
                    }
                    target.setCalendarValue(validFrom);
                }
            }
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
                    }
                    target.set(validFrom);
                }
            }
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            public void unsetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDFROM$6);
                }
            }
            
            /**
             * Gets the "ValidTo" attribute
             */
            public java.util.Calendar getValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    return target;
                }
            }
            
            /**
             * True if has "ValidTo" attribute
             */
            public boolean isSetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDTO$8) != null;
                }
            }
            
            /**
             * Sets the "ValidTo" attribute
             */
            public void setValidTo(java.util.Calendar validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
                    }
                    target.setCalendarValue(validTo);
                }
            }
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
                    }
                    target.set(validTo);
                }
            }
            
            /**
             * Unsets the "ValidTo" attribute
             */
            public void unsetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDTO$8);
                }
            }
            /**
             * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressType$Locality$SubLocality$NameElement.
             */
            public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.AddressType.Locality.SubLocality.NameElement
            {
                private static final long serialVersionUID = 1L;
                
                public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName ABBREVIATION$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
                private static final javax.xml.namespace.QName NAMETYPE$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameType");
                private static final javax.xml.namespace.QName NAMECODE$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCode");
                private static final javax.xml.namespace.QName NAMECODETYPE$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCodeType");
                
                
                /**
                 * Gets the "Abbreviation" attribute
                 */
                public boolean getAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Abbreviation" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Abbreviation" attribute
                 */
                public boolean isSetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ABBREVIATION$0) != null;
                    }
                }
                
                /**
                 * Sets the "Abbreviation" attribute
                 */
                public void setAbbreviation(boolean abbreviation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
                      }
                      target.setBooleanValue(abbreviation);
                    }
                }
                
                /**
                 * Sets (as xml) the "Abbreviation" attribute
                 */
                public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
                      }
                      target.set(abbreviation);
                    }
                }
                
                /**
                 * Unsets the "Abbreviation" attribute
                 */
                public void unsetAbbreviation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ABBREVIATION$0);
                    }
                }
                
                /**
                 * Gets the "NameType" attribute
                 */
                public oasisNamesTcCiqXal3.SubLocalityNameTypeList.Enum getNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return (oasisNamesTcCiqXal3.SubLocalityNameTypeList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameType" attribute
                 */
                public oasisNamesTcCiqXal3.SubLocalityNameTypeList xgetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubLocalityNameTypeList target = null;
                      target = (oasisNamesTcCiqXal3.SubLocalityNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameType" attribute
                 */
                public boolean isSetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMETYPE$2) != null;
                    }
                }
                
                /**
                 * Sets the "NameType" attribute
                 */
                public void setNameType(oasisNamesTcCiqXal3.SubLocalityNameTypeList.Enum nameType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$2);
                      }
                      target.setEnumValue(nameType);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameType" attribute
                 */
                public void xsetNameType(oasisNamesTcCiqXal3.SubLocalityNameTypeList nameType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubLocalityNameTypeList target = null;
                      target = (oasisNamesTcCiqXal3.SubLocalityNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXal3.SubLocalityNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
                      }
                      target.set(nameType);
                    }
                }
                
                /**
                 * Unsets the "NameType" attribute
                 */
                public void unsetNameType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMETYPE$2);
                    }
                }
                
                /**
                 * Gets the "NameCode" attribute
                 */
                public java.lang.String getNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameCode" attribute
                 */
                public oasisNamesTcCiqXal3.SubLocalityNameCodeList xgetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubLocalityNameCodeList target = null;
                      target = (oasisNamesTcCiqXal3.SubLocalityNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameCode" attribute
                 */
                public boolean isSetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMECODE$4) != null;
                    }
                }
                
                /**
                 * Sets the "NameCode" attribute
                 */
                public void setNameCode(java.lang.String nameCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODE$4);
                      }
                      target.setStringValue(nameCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameCode" attribute
                 */
                public void xsetNameCode(oasisNamesTcCiqXal3.SubLocalityNameCodeList nameCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXal3.SubLocalityNameCodeList target = null;
                      target = (oasisNamesTcCiqXal3.SubLocalityNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXal3.SubLocalityNameCodeList)get_store().add_attribute_user(NAMECODE$4);
                      }
                      target.set(nameCode);
                    }
                }
                
                /**
                 * Unsets the "NameCode" attribute
                 */
                public void unsetNameCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMECODE$4);
                    }
                }
                
                /**
                 * Gets the "NameCodeType" attribute
                 */
                public java.lang.String getNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NameCodeType" attribute
                 */
                public oasisNamesTcCiqCt3.String xgetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqCt3.String target = null;
                      target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "NameCodeType" attribute
                 */
                public boolean isSetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAMECODETYPE$6) != null;
                    }
                }
                
                /**
                 * Sets the "NameCodeType" attribute
                 */
                public void setNameCodeType(java.lang.String nameCodeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODETYPE$6);
                      }
                      target.setStringValue(nameCodeType);
                    }
                }
                
                /**
                 * Sets (as xml) the "NameCodeType" attribute
                 */
                public void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqCt3.String target = null;
                      target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMECODETYPE$6);
                      }
                      target.set(nameCodeType);
                    }
                }
                
                /**
                 * Unsets the "NameCodeType" attribute
                 */
                public void unsetNameCodeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAMECODETYPE$6);
                    }
                }
            }
        }
    }
    /**
     * An XML Thoroughfare(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class ThoroughfareImpl extends oasisNamesTcCiqXal3.impl.ThoroughfareTypeImpl implements oasisNamesTcCiqXal3.AddressType.Thoroughfare
    {
        private static final long serialVersionUID = 1L;
        
        public ThoroughfareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTHOROUGHFARE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SubThoroughfare");
        
        
        /**
         * Gets array of all "SubThoroughfare" elements
         */
        public oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare[] getSubThoroughfareArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTHOROUGHFARE$0, targetList);
                oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare[] result = new oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SubThoroughfare" element
         */
        public oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare getSubThoroughfareArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare)get_store().find_element_user(SUBTHOROUGHFARE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SubThoroughfare" element
         */
        public int sizeOfSubThoroughfareArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTHOROUGHFARE$0);
            }
        }
        
        /**
         * Sets array of all "SubThoroughfare" element
         */
        public void setSubThoroughfareArray(oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare[] subThoroughfareArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subThoroughfareArray, SUBTHOROUGHFARE$0);
            }
        }
        
        /**
         * Sets ith "SubThoroughfare" element
         */
        public void setSubThoroughfareArray(int i, oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare subThoroughfare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare)get_store().find_element_user(SUBTHOROUGHFARE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subThoroughfare);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubThoroughfare" element
         */
        public oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare insertNewSubThoroughfare(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare)get_store().insert_element_user(SUBTHOROUGHFARE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubThoroughfare" element
         */
        public oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare addNewSubThoroughfare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare)get_store().add_element_user(SUBTHOROUGHFARE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SubThoroughfare" element
         */
        public void removeSubThoroughfare(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTHOROUGHFARE$0, i);
            }
        }
        /**
         * An XML SubThoroughfare(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class SubThoroughfareImpl extends oasisNamesTcCiqXal3.impl.ThoroughfareTypeImpl implements oasisNamesTcCiqXal3.AddressType.Thoroughfare.SubThoroughfare
        {
            private static final long serialVersionUID = 1L;
            
            public SubThoroughfareImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
    /**
     * An XML Premises(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class PremisesImpl extends oasisNamesTcCiqXal3.impl.PremisesTypeImpl implements oasisNamesTcCiqXal3.AddressType.Premises
    {
        private static final long serialVersionUID = 1L;
        
        public PremisesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBPREMISES$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SubPremises");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName TYPECODE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "TypeCode");
        
        
        /**
         * Gets array of all "SubPremises" elements
         */
        public oasisNamesTcCiqXal3.AddressType.Premises.SubPremises[] getSubPremisesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBPREMISES$0, targetList);
                oasisNamesTcCiqXal3.AddressType.Premises.SubPremises[] result = new oasisNamesTcCiqXal3.AddressType.Premises.SubPremises[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SubPremises" element
         */
        public oasisNamesTcCiqXal3.AddressType.Premises.SubPremises getSubPremisesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Premises.SubPremises target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Premises.SubPremises)get_store().find_element_user(SUBPREMISES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SubPremises" element
         */
        public int sizeOfSubPremisesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBPREMISES$0);
            }
        }
        
        /**
         * Sets array of all "SubPremises" element
         */
        public void setSubPremisesArray(oasisNamesTcCiqXal3.AddressType.Premises.SubPremises[] subPremisesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subPremisesArray, SUBPREMISES$0);
            }
        }
        
        /**
         * Sets ith "SubPremises" element
         */
        public void setSubPremisesArray(int i, oasisNamesTcCiqXal3.AddressType.Premises.SubPremises subPremises)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Premises.SubPremises target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Premises.SubPremises)get_store().find_element_user(SUBPREMISES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subPremises);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubPremises" element
         */
        public oasisNamesTcCiqXal3.AddressType.Premises.SubPremises insertNewSubPremises(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Premises.SubPremises target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Premises.SubPremises)get_store().insert_element_user(SUBPREMISES$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubPremises" element
         */
        public oasisNamesTcCiqXal3.AddressType.Premises.SubPremises addNewSubPremises()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.Premises.SubPremises target = null;
                target = (oasisNamesTcCiqXal3.AddressType.Premises.SubPremises)get_store().add_element_user(SUBPREMISES$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SubPremises" element
         */
        public void removeSubPremises(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBPREMISES$0, i);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public oasisNamesTcCiqXal3.PremisesTypeList.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXal3.PremisesTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.PremisesTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PremisesTypeList target = null;
                target = (oasisNamesTcCiqXal3.PremisesTypeList)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(oasisNamesTcCiqXal3.PremisesTypeList.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.PremisesTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PremisesTypeList target = null;
                target = (oasisNamesTcCiqXal3.PremisesTypeList)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.PremisesTypeList)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "TypeCode" attribute
         */
        public java.lang.String getTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TypeCode" attribute
         */
        public oasisNamesTcCiqCt3.String xgetTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$4);
                return target;
            }
        }
        
        /**
         * True if has "TypeCode" attribute
         */
        public boolean isSetTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPECODE$4) != null;
            }
        }
        
        /**
         * Sets the "TypeCode" attribute
         */
        public void setTypeCode(java.lang.String typeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$4);
                }
                target.setStringValue(typeCode);
            }
        }
        
        /**
         * Sets (as xml) the "TypeCode" attribute
         */
        public void xsetTypeCode(oasisNamesTcCiqCt3.String typeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(TYPECODE$4);
                }
                target.set(typeCode);
            }
        }
        
        /**
         * Unsets the "TypeCode" attribute
         */
        public void unsetTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPECODE$4);
            }
        }
        /**
         * An XML SubPremises(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class SubPremisesImpl extends oasisNamesTcCiqXal3.impl.PremisesTypeImpl implements oasisNamesTcCiqXal3.AddressType.Premises.SubPremises
        {
            private static final long serialVersionUID = 1L;
            
            public SubPremisesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
            private static final javax.xml.namespace.QName TYPECODE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "TypeCode");
            
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubPremisesTypeList.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.SubPremisesTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXal3.SubPremisesTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubPremisesTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubPremisesTypeList)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * True if has "Type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$0) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(oasisNamesTcCiqXal3.SubPremisesTypeList.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXal3.SubPremisesTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.SubPremisesTypeList target = null;
                    target = (oasisNamesTcCiqXal3.SubPremisesTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.SubPremisesTypeList)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "Type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$0);
                }
            }
            
            /**
             * Gets the "TypeCode" attribute
             */
            public java.lang.String getTypeCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TypeCode" attribute
             */
            public oasisNamesTcCiqCt3.String xgetTypeCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$2);
                    return target;
                }
            }
            
            /**
             * True if has "TypeCode" attribute
             */
            public boolean isSetTypeCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPECODE$2) != null;
                }
            }
            
            /**
             * Sets the "TypeCode" attribute
             */
            public void setTypeCode(java.lang.String typeCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$2);
                    }
                    target.setStringValue(typeCode);
                }
            }
            
            /**
             * Sets (as xml) the "TypeCode" attribute
             */
            public void xsetTypeCode(oasisNamesTcCiqCt3.String typeCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(TYPECODE$2);
                    }
                    target.set(typeCode);
                }
            }
            
            /**
             * Unsets the "TypeCode" attribute
             */
            public void unsetTypeCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPECODE$2);
                }
            }
        }
    }
    /**
     * An XML PostCode(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.PostCode
    {
        private static final long serialVersionUID = 1L;
        
        public PostCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Identifier");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public oasisNamesTcCiqXal3.IdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                oasisNamesTcCiqXal3.IdentifierType[] result = new oasisNamesTcCiqXal3.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(oasisNamesTcCiqXal3.IdentifierType[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, oasisNamesTcCiqXal3.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$2);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$4) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$4);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$6) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$6);
            }
        }
    }
    /**
     * An XML RuralDelivery(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class RuralDeliveryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.RuralDelivery
    {
        private static final long serialVersionUID = 1L;
        
        public RuralDeliveryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Identifier");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public oasisNamesTcCiqXal3.IdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                oasisNamesTcCiqXal3.IdentifierType[] result = new oasisNamesTcCiqXal3.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(oasisNamesTcCiqXal3.IdentifierType[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, oasisNamesTcCiqXal3.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.RuralDeliveryTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.RuralDeliveryTypeList target = null;
                target = (oasisNamesTcCiqXal3.RuralDeliveryTypeList)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.RuralDeliveryTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.RuralDeliveryTypeList target = null;
                target = (oasisNamesTcCiqXal3.RuralDeliveryTypeList)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.RuralDeliveryTypeList)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$4);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$6) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$6);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$8) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$8);
            }
        }
    }
    /**
     * An XML PostalDeliveryPoint(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class PostalDeliveryPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.PostalDeliveryPoint
    {
        private static final long serialVersionUID = 1L;
        
        public PostalDeliveryPointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Identifier");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public oasisNamesTcCiqXal3.IdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                oasisNamesTcCiqXal3.IdentifierType[] result = new oasisNamesTcCiqXal3.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(oasisNamesTcCiqXal3.IdentifierType[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, oasisNamesTcCiqXal3.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public oasisNamesTcCiqXal3.PostalDeliveryPointTypeList.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXal3.PostalDeliveryPointTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.PostalDeliveryPointTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PostalDeliveryPointTypeList target = null;
                target = (oasisNamesTcCiqXal3.PostalDeliveryPointTypeList)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(oasisNamesTcCiqXal3.PostalDeliveryPointTypeList.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.PostalDeliveryPointTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PostalDeliveryPointTypeList target = null;
                target = (oasisNamesTcCiqXal3.PostalDeliveryPointTypeList)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.PostalDeliveryPointTypeList)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$4);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$6) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$6);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$8) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$8);
            }
        }
    }
    /**
     * An XML PostOffice(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class PostOfficeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.PostOffice
    {
        private static final long serialVersionUID = 1L;
        
        public PostOfficeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Identifier");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public oasisNamesTcCiqXal3.IdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                oasisNamesTcCiqXal3.IdentifierType[] result = new oasisNamesTcCiqXal3.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(oasisNamesTcCiqXal3.IdentifierType[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, oasisNamesTcCiqXal3.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public oasisNamesTcCiqXal3.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.IdentifierType target = null;
                target = (oasisNamesTcCiqXal3.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXal3.PostOfficeTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PostOfficeTypeList target = null;
                target = (oasisNamesTcCiqXal3.PostOfficeTypeList)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXal3.PostOfficeTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PostOfficeTypeList target = null;
                target = (oasisNamesTcCiqXal3.PostOfficeTypeList)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.PostOfficeTypeList)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$4);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$6) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$6);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$8) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$8);
            }
        }
    }
    /**
     * An XML GeoRSS(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class GeoRSSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.GeoRSS
    {
        private static final long serialVersionUID = 1L;
        
        public GeoRSSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML LocationByCoordinates(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is a complex type.
     */
    public static class LocationByCoordinatesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.LocationByCoordinates
    {
        private static final long serialVersionUID = 1L;
        
        public LocationByCoordinatesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LATITUDE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Latitude");
        private static final javax.xml.namespace.QName LONGITUDE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Longitude");
        private static final javax.xml.namespace.QName MERIDIAN$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Meridian");
        private static final javax.xml.namespace.QName MERIDIANCODETYPE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "MeridianCodeType");
        private static final javax.xml.namespace.QName DATUM$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Datum");
        private static final javax.xml.namespace.QName DATUMCODETYPE$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "DatumCodeType");
        private static final javax.xml.namespace.QName PROJECTION$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Projection");
        private static final javax.xml.namespace.QName PROJECTIONCODETYPE$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "ProjectionCodeType");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets the "Latitude" element
         */
        public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude)get_store().find_element_user(LATITUDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Latitude" element
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LATITUDE$0) != 0;
            }
        }
        
        /**
         * Sets the "Latitude" element
         */
        public void setLatitude(oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude)get_store().find_element_user(LATITUDE$0, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude)get_store().add_element_user(LATITUDE$0);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Appends and returns a new empty "Latitude" element
         */
        public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude addNewLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude)get_store().add_element_user(LATITUDE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Latitude" element
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LATITUDE$0, 0);
            }
        }
        
        /**
         * Gets the "Longitude" element
         */
        public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude)get_store().find_element_user(LONGITUDE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Longitude" element
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONGITUDE$2) != 0;
            }
        }
        
        /**
         * Sets the "Longitude" element
         */
        public void setLongitude(oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude)get_store().find_element_user(LONGITUDE$2, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude)get_store().add_element_user(LONGITUDE$2);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Appends and returns a new empty "Longitude" element
         */
        public oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude addNewLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude target = null;
                target = (oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude)get_store().add_element_user(LONGITUDE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Longitude" element
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONGITUDE$2, 0);
            }
        }
        
        /**
         * Gets the "Meridian" attribute
         */
        public java.lang.String getMeridian()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERIDIAN$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Meridian" attribute
         */
        public oasisNamesTcCiqXal3.MeridianCodeList xgetMeridian()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.MeridianCodeList target = null;
                target = (oasisNamesTcCiqXal3.MeridianCodeList)get_store().find_attribute_user(MERIDIAN$4);
                return target;
            }
        }
        
        /**
         * True if has "Meridian" attribute
         */
        public boolean isSetMeridian()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MERIDIAN$4) != null;
            }
        }
        
        /**
         * Sets the "Meridian" attribute
         */
        public void setMeridian(java.lang.String meridian)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERIDIAN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERIDIAN$4);
                }
                target.setStringValue(meridian);
            }
        }
        
        /**
         * Sets (as xml) the "Meridian" attribute
         */
        public void xsetMeridian(oasisNamesTcCiqXal3.MeridianCodeList meridian)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.MeridianCodeList target = null;
                target = (oasisNamesTcCiqXal3.MeridianCodeList)get_store().find_attribute_user(MERIDIAN$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.MeridianCodeList)get_store().add_attribute_user(MERIDIAN$4);
                }
                target.set(meridian);
            }
        }
        
        /**
         * Unsets the "Meridian" attribute
         */
        public void unsetMeridian()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MERIDIAN$4);
            }
        }
        
        /**
         * Gets the "MeridianCodeType" attribute
         */
        public java.lang.String getMeridianCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERIDIANCODETYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MeridianCodeType" attribute
         */
        public oasisNamesTcCiqCt3.String xgetMeridianCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MERIDIANCODETYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "MeridianCodeType" attribute
         */
        public boolean isSetMeridianCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MERIDIANCODETYPE$6) != null;
            }
        }
        
        /**
         * Sets the "MeridianCodeType" attribute
         */
        public void setMeridianCodeType(java.lang.String meridianCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERIDIANCODETYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERIDIANCODETYPE$6);
                }
                target.setStringValue(meridianCodeType);
            }
        }
        
        /**
         * Sets (as xml) the "MeridianCodeType" attribute
         */
        public void xsetMeridianCodeType(oasisNamesTcCiqCt3.String meridianCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MERIDIANCODETYPE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(MERIDIANCODETYPE$6);
                }
                target.set(meridianCodeType);
            }
        }
        
        /**
         * Unsets the "MeridianCodeType" attribute
         */
        public void unsetMeridianCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MERIDIANCODETYPE$6);
            }
        }
        
        /**
         * Gets the "Datum" attribute
         */
        public java.lang.String getDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Datum" attribute
         */
        public oasisNamesTcCiqXal3.DatumCodeList xgetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.DatumCodeList target = null;
                target = (oasisNamesTcCiqXal3.DatumCodeList)get_store().find_attribute_user(DATUM$8);
                return target;
            }
        }
        
        /**
         * True if has "Datum" attribute
         */
        public boolean isSetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATUM$8) != null;
            }
        }
        
        /**
         * Sets the "Datum" attribute
         */
        public void setDatum(java.lang.String datum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATUM$8);
                }
                target.setStringValue(datum);
            }
        }
        
        /**
         * Sets (as xml) the "Datum" attribute
         */
        public void xsetDatum(oasisNamesTcCiqXal3.DatumCodeList datum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.DatumCodeList target = null;
                target = (oasisNamesTcCiqXal3.DatumCodeList)get_store().find_attribute_user(DATUM$8);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.DatumCodeList)get_store().add_attribute_user(DATUM$8);
                }
                target.set(datum);
            }
        }
        
        /**
         * Unsets the "Datum" attribute
         */
        public void unsetDatum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATUM$8);
            }
        }
        
        /**
         * Gets the "DatumCodeType" attribute
         */
        public java.lang.String getDatumCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUMCODETYPE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DatumCodeType" attribute
         */
        public oasisNamesTcCiqCt3.String xgetDatumCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DATUMCODETYPE$10);
                return target;
            }
        }
        
        /**
         * True if has "DatumCodeType" attribute
         */
        public boolean isSetDatumCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATUMCODETYPE$10) != null;
            }
        }
        
        /**
         * Sets the "DatumCodeType" attribute
         */
        public void setDatumCodeType(java.lang.String datumCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUMCODETYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATUMCODETYPE$10);
                }
                target.setStringValue(datumCodeType);
            }
        }
        
        /**
         * Sets (as xml) the "DatumCodeType" attribute
         */
        public void xsetDatumCodeType(oasisNamesTcCiqCt3.String datumCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DATUMCODETYPE$10);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(DATUMCODETYPE$10);
                }
                target.set(datumCodeType);
            }
        }
        
        /**
         * Unsets the "DatumCodeType" attribute
         */
        public void unsetDatumCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATUMCODETYPE$10);
            }
        }
        
        /**
         * Gets the "Projection" attribute
         */
        public java.lang.String getProjection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Projection" attribute
         */
        public oasisNamesTcCiqXal3.ProjectionCodeList xgetProjection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.ProjectionCodeList target = null;
                target = (oasisNamesTcCiqXal3.ProjectionCodeList)get_store().find_attribute_user(PROJECTION$12);
                return target;
            }
        }
        
        /**
         * True if has "Projection" attribute
         */
        public boolean isSetProjection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROJECTION$12) != null;
            }
        }
        
        /**
         * Sets the "Projection" attribute
         */
        public void setProjection(java.lang.String projection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROJECTION$12);
                }
                target.setStringValue(projection);
            }
        }
        
        /**
         * Sets (as xml) the "Projection" attribute
         */
        public void xsetProjection(oasisNamesTcCiqXal3.ProjectionCodeList projection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.ProjectionCodeList target = null;
                target = (oasisNamesTcCiqXal3.ProjectionCodeList)get_store().find_attribute_user(PROJECTION$12);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.ProjectionCodeList)get_store().add_attribute_user(PROJECTION$12);
                }
                target.set(projection);
            }
        }
        
        /**
         * Unsets the "Projection" attribute
         */
        public void unsetProjection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROJECTION$12);
            }
        }
        
        /**
         * Gets the "ProjectionCodeType" attribute
         */
        public java.lang.String getProjectionCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTIONCODETYPE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProjectionCodeType" attribute
         */
        public oasisNamesTcCiqCt3.String xgetProjectionCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PROJECTIONCODETYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "ProjectionCodeType" attribute
         */
        public boolean isSetProjectionCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROJECTIONCODETYPE$14) != null;
            }
        }
        
        /**
         * Sets the "ProjectionCodeType" attribute
         */
        public void setProjectionCodeType(java.lang.String projectionCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTIONCODETYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROJECTIONCODETYPE$14);
                }
                target.setStringValue(projectionCodeType);
            }
        }
        
        /**
         * Sets (as xml) the "ProjectionCodeType" attribute
         */
        public void xsetProjectionCodeType(oasisNamesTcCiqCt3.String projectionCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PROJECTIONCODETYPE$14);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(PROJECTIONCODETYPE$14);
                }
                target.set(projectionCodeType);
            }
        }
        
        /**
         * Unsets the "ProjectionCodeType" attribute
         */
        public void unsetProjectionCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROJECTIONCODETYPE$14);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$16) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$16);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$16);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$16);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$18);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$18) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$18);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$18);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$18);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$20);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$20);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$20) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$20);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$20);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$20);
            }
        }
        /**
         * An XML Latitude(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class LatitudeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Latitude
        {
            private static final long serialVersionUID = 1L;
            
            public LatitudeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DEGREESMEASURE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "DegreesMeasure");
            private static final javax.xml.namespace.QName MINUTESMEASURE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "MinutesMeasure");
            private static final javax.xml.namespace.QName SECONDSMEASURE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SecondsMeasure");
            private static final javax.xml.namespace.QName DIRECTION$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Direction");
            
            
            /**
             * Gets the "DegreesMeasure" attribute
             */
            public java.lang.String getDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DegreesMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DEGREESMEASURE$0);
                    return target;
                }
            }
            
            /**
             * True if has "DegreesMeasure" attribute
             */
            public boolean isSetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DEGREESMEASURE$0) != null;
                }
            }
            
            /**
             * Sets the "DegreesMeasure" attribute
             */
            public void setDegreesMeasure(java.lang.String degreesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEGREESMEASURE$0);
                    }
                    target.setStringValue(degreesMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "DegreesMeasure" attribute
             */
            public void xsetDegreesMeasure(oasisNamesTcCiqCt3.String degreesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(DEGREESMEASURE$0);
                    }
                    target.set(degreesMeasure);
                }
            }
            
            /**
             * Unsets the "DegreesMeasure" attribute
             */
            public void unsetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DEGREESMEASURE$0);
                }
            }
            
            /**
             * Gets the "MinutesMeasure" attribute
             */
            public java.lang.String getMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "MinutesMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MINUTESMEASURE$2);
                    return target;
                }
            }
            
            /**
             * True if has "MinutesMeasure" attribute
             */
            public boolean isSetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MINUTESMEASURE$2) != null;
                }
            }
            
            /**
             * Sets the "MinutesMeasure" attribute
             */
            public void setMinutesMeasure(java.lang.String minutesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINUTESMEASURE$2);
                    }
                    target.setStringValue(minutesMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "MinutesMeasure" attribute
             */
            public void xsetMinutesMeasure(oasisNamesTcCiqCt3.String minutesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(MINUTESMEASURE$2);
                    }
                    target.set(minutesMeasure);
                }
            }
            
            /**
             * Unsets the "MinutesMeasure" attribute
             */
            public void unsetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MINUTESMEASURE$2);
                }
            }
            
            /**
             * Gets the "SecondsMeasure" attribute
             */
            public java.lang.String getSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SecondsMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SECONDSMEASURE$4);
                    return target;
                }
            }
            
            /**
             * True if has "SecondsMeasure" attribute
             */
            public boolean isSetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SECONDSMEASURE$4) != null;
                }
            }
            
            /**
             * Sets the "SecondsMeasure" attribute
             */
            public void setSecondsMeasure(java.lang.String secondsMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECONDSMEASURE$4);
                    }
                    target.setStringValue(secondsMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "SecondsMeasure" attribute
             */
            public void xsetSecondsMeasure(oasisNamesTcCiqCt3.String secondsMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(SECONDSMEASURE$4);
                    }
                    target.set(secondsMeasure);
                }
            }
            
            /**
             * Unsets the "SecondsMeasure" attribute
             */
            public void unsetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SECONDSMEASURE$4);
                }
            }
            
            /**
             * Gets the "Direction" attribute
             */
            public oasisNamesTcCiqXal3.DirectionTypeList.Enum getDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.DirectionTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Direction" attribute
             */
            public oasisNamesTcCiqXal3.DirectionTypeList xgetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.DirectionTypeList target = null;
                    target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().find_attribute_user(DIRECTION$6);
                    return target;
                }
            }
            
            /**
             * True if has "Direction" attribute
             */
            public boolean isSetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DIRECTION$6) != null;
                }
            }
            
            /**
             * Sets the "Direction" attribute
             */
            public void setDirection(oasisNamesTcCiqXal3.DirectionTypeList.Enum direction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$6);
                    }
                    target.setEnumValue(direction);
                }
            }
            
            /**
             * Sets (as xml) the "Direction" attribute
             */
            public void xsetDirection(oasisNamesTcCiqXal3.DirectionTypeList direction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.DirectionTypeList target = null;
                    target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().add_attribute_user(DIRECTION$6);
                    }
                    target.set(direction);
                }
            }
            
            /**
             * Unsets the "Direction" attribute
             */
            public void unsetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DIRECTION$6);
                }
            }
        }
        /**
         * An XML Longitude(@urn:oasis:names:tc:ciq:xal:3).
         *
         * This is a complex type.
         */
        public static class LongitudeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressType.LocationByCoordinates.Longitude
        {
            private static final long serialVersionUID = 1L;
            
            public LongitudeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DEGREESMEASURE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "DegreesMeasure");
            private static final javax.xml.namespace.QName MINUTESMEASURE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "MinutesMeasure");
            private static final javax.xml.namespace.QName SECONDSMEASURE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "SecondsMeasure");
            private static final javax.xml.namespace.QName DIRECTION$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Direction");
            
            
            /**
             * Gets the "DegreesMeasure" attribute
             */
            public java.lang.String getDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DegreesMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DEGREESMEASURE$0);
                    return target;
                }
            }
            
            /**
             * True if has "DegreesMeasure" attribute
             */
            public boolean isSetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DEGREESMEASURE$0) != null;
                }
            }
            
            /**
             * Sets the "DegreesMeasure" attribute
             */
            public void setDegreesMeasure(java.lang.String degreesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEGREESMEASURE$0);
                    }
                    target.setStringValue(degreesMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "DegreesMeasure" attribute
             */
            public void xsetDegreesMeasure(oasisNamesTcCiqCt3.String degreesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(DEGREESMEASURE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(DEGREESMEASURE$0);
                    }
                    target.set(degreesMeasure);
                }
            }
            
            /**
             * Unsets the "DegreesMeasure" attribute
             */
            public void unsetDegreesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DEGREESMEASURE$0);
                }
            }
            
            /**
             * Gets the "MinutesMeasure" attribute
             */
            public java.lang.String getMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "MinutesMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MINUTESMEASURE$2);
                    return target;
                }
            }
            
            /**
             * True if has "MinutesMeasure" attribute
             */
            public boolean isSetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MINUTESMEASURE$2) != null;
                }
            }
            
            /**
             * Sets the "MinutesMeasure" attribute
             */
            public void setMinutesMeasure(java.lang.String minutesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINUTESMEASURE$2);
                    }
                    target.setStringValue(minutesMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "MinutesMeasure" attribute
             */
            public void xsetMinutesMeasure(oasisNamesTcCiqCt3.String minutesMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MINUTESMEASURE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(MINUTESMEASURE$2);
                    }
                    target.set(minutesMeasure);
                }
            }
            
            /**
             * Unsets the "MinutesMeasure" attribute
             */
            public void unsetMinutesMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MINUTESMEASURE$2);
                }
            }
            
            /**
             * Gets the "SecondsMeasure" attribute
             */
            public java.lang.String getSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SecondsMeasure" attribute
             */
            public oasisNamesTcCiqCt3.String xgetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SECONDSMEASURE$4);
                    return target;
                }
            }
            
            /**
             * True if has "SecondsMeasure" attribute
             */
            public boolean isSetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SECONDSMEASURE$4) != null;
                }
            }
            
            /**
             * Sets the "SecondsMeasure" attribute
             */
            public void setSecondsMeasure(java.lang.String secondsMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECONDSMEASURE$4);
                    }
                    target.setStringValue(secondsMeasure);
                }
            }
            
            /**
             * Sets (as xml) the "SecondsMeasure" attribute
             */
            public void xsetSecondsMeasure(oasisNamesTcCiqCt3.String secondsMeasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SECONDSMEASURE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(SECONDSMEASURE$4);
                    }
                    target.set(secondsMeasure);
                }
            }
            
            /**
             * Unsets the "SecondsMeasure" attribute
             */
            public void unsetSecondsMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SECONDSMEASURE$4);
                }
            }
            
            /**
             * Gets the "Direction" attribute
             */
            public oasisNamesTcCiqXal3.DirectionTypeList.Enum getDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXal3.DirectionTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Direction" attribute
             */
            public oasisNamesTcCiqXal3.DirectionTypeList xgetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.DirectionTypeList target = null;
                    target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().find_attribute_user(DIRECTION$6);
                    return target;
                }
            }
            
            /**
             * True if has "Direction" attribute
             */
            public boolean isSetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DIRECTION$6) != null;
                }
            }
            
            /**
             * Sets the "Direction" attribute
             */
            public void setDirection(oasisNamesTcCiqXal3.DirectionTypeList.Enum direction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$6);
                    }
                    target.setEnumValue(direction);
                }
            }
            
            /**
             * Sets (as xml) the "Direction" attribute
             */
            public void xsetDirection(oasisNamesTcCiqXal3.DirectionTypeList direction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.DirectionTypeList target = null;
                    target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().find_attribute_user(DIRECTION$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.DirectionTypeList)get_store().add_attribute_user(DIRECTION$6);
                    }
                    target.set(direction);
                }
            }
            
            /**
             * Unsets the "Direction" attribute
             */
            public void unsetDirection()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DIRECTION$6);
                }
            }
        }
    }
}
