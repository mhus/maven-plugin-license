package de.mhus.mvn.license;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "check", defaultPhase = LifecyclePhase.VERIFY, threadSafe = true, aggregator = true)
public class AggregatorLicenseCheckMojo extends LicenseCheckMojo {

}
