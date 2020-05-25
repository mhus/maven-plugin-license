package de.mhus.mvn.license;

import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "remove", threadSafe = true, aggregator = true)
public class AggregatorLicenseRemoveMojo extends LicenseRemoveMojo {

}
