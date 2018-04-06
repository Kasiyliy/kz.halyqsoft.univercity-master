package kz.halyqsoft.univercity.modules.creation;

import com.vaadin.ui.Button;
import org.r3a.common.entity.beans.AbstractTask;
import org.r3a.common.vaadin.view.AbstractTaskView;

public class CreationView extends AbstractTaskView {


    public CreationView(AbstractTask task) throws Exception {
        super(task);
    }

    @Override
    public void initView(boolean b) throws Exception {
        Button btn = new Button();

        getContent().addComponent(btn);
    }
}
