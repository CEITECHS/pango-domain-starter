package com.ceitechs.domain.autoconfigure;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author iddymagohe
 * @since 1.0
 */

@ConfigurationProperties("pango.domain.service")
public class PangoDomainServiceProperties {

    /**
     * Replica sets comma separated hostAndports.
     * Ex. host1:port1,host2:port2
     */
    @Getter
    @Setter
    private String dbHostName = "localhost:27017";

    /**
     * domain service database name
     */
    @Getter
    @Setter
    private String dbName = "pango";

    /**
     * domain service db user
     *
     */
    @Getter
    @Setter
    private String dbUser = "pangoWriteUser";

    /**
     * domain service db user password
     */
    @Getter
    @Setter
    private String dbPassword ="pangoPreprodWriteUsrPass10";

    /**
     * attachments bucket name
     */
    @Setter
    @Getter
    private String bucketName = "picture";

}
