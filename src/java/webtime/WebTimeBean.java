/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package webtime;

import java.text.DateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alejandra
 */
@Named("webTimeBean")
@RequestScoped
public class WebTimeBean {

    public String getTime() {

        return DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
    }

}
