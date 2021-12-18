package io.unity;

import io.unity.methods.text_box_methods;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.json.simple.JSONObject;

public class locator_identifier {

    JavaClassSource java_class;

    locator_identifier(JavaClassSource java_class) {
        this.java_class = java_class;
    }


    public void identify_locator_and_generate_object(String key_name, JSONObject single_object) {

        text_box_methods text_box_method = new text_box_methods(java_class);

        String element_type = (String) single_object.get("element_type");
        if (element_type.equals("text_box")) {

            text_box_method.enter_text(key_name);
            text_box_method.clear_text_box(key_name);
            text_box_method.verify_text_box_is_present(key_name);
            text_box_method.clear_and_enter_text_box(key_name);

        } else if (element_type.equals("email")) {

        } else if (element_type.equals("password")) {

        } else if (element_type.equals("button")) {


        } else if (element_type.equals("check_box")) {


        } else if (element_type.equals("label")) {


        } else if (element_type.equals("radio")) {

        }
        else if (element_type.equals("text_area")) {

        }
        else if (element_type.equals("drop_down")) {

        }else if (element_type.equals("file")) {

        }else if (element_type.equals("link")) {

        }


    }


}
