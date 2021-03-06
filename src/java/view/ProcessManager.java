
package view;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author NguyenTrung
 */
@SessionScoped
@Named
public class ProcessManager implements Serializable {

    @Inject
    UserView userView;

    public void proceed() {
        System.out.println(userView.getLogin() + " " + userView.getEmail());
    }

}
