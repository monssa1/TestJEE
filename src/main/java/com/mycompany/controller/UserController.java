package com.mycompany.controller;

import com.mycompany.maventdsi.User;
import com.mycompany.facade.UserFacade;
import com.mycompany.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "userController")
@ViewScoped
public class UserController extends AbstractController<User> {

    @Inject
    private MobilePageController mobilePageController;

    public UserController() {
        // Inform the Abstract parent controller of the concrete User Entity
        super(User.class);
    }

}
