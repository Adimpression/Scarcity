
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Says "Hi" to the user.
 */
@Mojo(name = "run")
public class Plugin extends AbstractMojo {

  @Parameter(property = "source", defaultValue = "src/main/osv")
  private String source;

  @Parameter(property = "destination", defaultValue = "src/main/proto")
  private String destination;

  public void execute() throws MojoExecutionException {

    try {
      getLog().info("Compiling State Starting");
      getLog().info("Using source:" + source);
      getLog().info("Using destination:" + destination);
      Main.main(new String[]{source, destination});
      getLog().info("Compiling State Completed");
    } catch (final Throwable e) {
      getLog().error(e);
      throw new MojoExecutionException(e.getMessage());
    }
  }
}

