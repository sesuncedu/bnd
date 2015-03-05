package aQute.remote.api;

import java.util.Map;

import org.osgi.framework.dto.BundleDTO;
import org.osgi.framework.dto.FrameworkDTO;

public interface Agent {
	public static final int DEFAULT_PORT = 29998;

	FrameworkDTO getFramework() throws Exception;

	BundleDTO install(String location, String sha) throws Exception;

	String start(long... id) throws Exception;

	String stop(long... id) throws Exception;

	String uninstall(long... id) throws Exception;

	String update(Map<String, String> bundles) throws Exception;

	void redirect(boolean on) throws Exception;

	void stdin(String s) throws Exception;

	String shell(String cmd) throws Exception;

	boolean abort();

}
