package com.jonvallet.dropwizard.api;

import org.hibernate.validator.constraints.Length;

/**
 * Created by j.vallet@validus-ivc.co.uk on 06/04/16.
 */
public class Saying {

    public final long id;

    @Length(max = 3)
    public final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
