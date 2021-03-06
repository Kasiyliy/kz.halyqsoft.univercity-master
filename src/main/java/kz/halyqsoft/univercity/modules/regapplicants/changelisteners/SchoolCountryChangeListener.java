package kz.halyqsoft.univercity.modules.regapplicants.changelisteners;

import com.vaadin.data.Property;
import kz.halyqsoft.univercity.entity.beans.univercity.catalog.COUNTRY;
import org.r3a.common.entity.ID;
import org.r3a.common.entity.query.QueryModel;
import org.r3a.common.entity.query.where.ECriteria;
import org.r3a.common.vaadin.widget.form.field.fk.FKFieldModel;

/**
 * @author Omarbek
 * @created on 27.03.2018
 */
public class SchoolCountryChangeListener implements Property.ValueChangeListener {

    private final FKFieldModel schoolRegionFieldModel;
    private final COUNTRY schoolRegion;

    public SchoolCountryChangeListener(FKFieldModel schoolRegionFieldModel, COUNTRY schoolRegion) {
        this.schoolRegionFieldModel = schoolRegionFieldModel;
        this.schoolRegion = schoolRegion;
    }

    @Override
    public void valueChange(Property.ValueChangeEvent ev) {
        Object value = ev.getProperty().getValue();
        QueryModel qm = schoolRegionFieldModel.getQueryModel();
        if (value != null) {
            qm.addWhere("parent", ECriteria.EQUAL, ((COUNTRY) value).getId());
        } else {
            qm.addWhere("parent", ECriteria.EQUAL, ID.valueOf(-1));
        }
        try {
            schoolRegionFieldModel.refresh(schoolRegion);
        } catch (Exception e) {
            e.printStackTrace();//TODO catch
        }
    }
}
