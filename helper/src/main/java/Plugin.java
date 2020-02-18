

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "run")
public class Plugin extends AbstractMojo {


  @Parameter(property = "pb")
  private String pb;

  @Parameter(property = "csv")
  private String csv;

  @Parameter(property = "tsv")
  private String tsv;

  public void execute() throws MojoExecutionException {

    try {
      getLog().info("Helper Starting");

      getLog().info("Using pb:" + pb);
      getLog().info("Using csv:" + csv);
      getLog().info("Using tsv:" + tsv);

      Main.main(new String[]{pb, csv, tsv});
      getLog().info("Helper Completed");
    } catch (final Throwable e) {
      getLog().error(e);
      throw new MojoExecutionException(e.getMessage());
    }
  }
}

