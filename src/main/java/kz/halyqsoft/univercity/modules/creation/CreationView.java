package kz.halyqsoft.univercity.modules.creation;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import kz.halyqsoft.univercity.entity.beans.TASKS;
import org.r3a.common.dblink.facade.CommonEntityFacadeBean;
import org.r3a.common.dblink.utils.SessionFacadeFactory;
import org.r3a.common.entity.beans.AbstractTask;
import org.r3a.common.entity.query.QueryModel;
import org.r3a.common.vaadin.view.AbstractTaskView;

import java.math.BigInteger;
import java.util.List;

public class CreationView extends AbstractTaskView {

    private HorizontalLayout horizontalLayout;
    public CreationView(AbstractTask task) throws Exception {
        super(task);
    }

    @Override
    public void initView(boolean b) throws Exception {

        horizontalLayout = new HorizontalLayout();

        TASKS t = new TASKS();
        Table taskTable = new Table("Task creation");
        taskTable.addContainerProperty("ID" , BigInteger.class , null);
        taskTable.addContainerProperty("NAME" , String.class , null);
        taskTable.addContainerProperty("TITLE" , String.class , null);
        taskTable.addContainerProperty("TASK_TYPE" , Boolean.class , null);
        taskTable.addContainerProperty("TASK_ORDER" , Integer.class , null);
        taskTable.addContainerProperty("CLASS_PATH" , String.class , null);
        taskTable.addContainerProperty("PARENT_ID" , String.class , null);
        taskTable.addContainerProperty("ICON_NAME" , String.class , null);
        taskTable.addContainerProperty("DESCRIPTION" , String.class , null);
        taskTable.addContainerProperty("VISIBLE" , Boolean.class , null);

        QueryModel<TASKS> queryModel = new QueryModel<TASKS>(TASKS.class);
        List<TASKS> tasks = SessionFacadeFactory.getSessionFacade(CommonEntityFacadeBean.class).lookup(queryModel);

        for(TASKS task : tasks)
        {
            taskTable.addItem(new Object[]{task.getId().getId() , task.getName() , task.getTitle() , new Boolean(task.getTaskType()) , new Integer(task.getTaskOrder().intValue() ) , task.getClassPath() , task.getParent().getId() + " " + task.getParent().getName() ,task.getIconPath() , task.getDescr() , task.isVisible() } , task.getId().getId());
        }

        taskTable.setPageLength(taskTable.size());

        horizontalLayout.addComponent(taskTable);
        horizontalLayout.setComponentAlignment(taskTable , Alignment.MIDDLE_CENTER);



        getContent().addComponent(horizontalLayout);
    }
}
