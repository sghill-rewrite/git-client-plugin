package org.jenkinsci.plugins.gitclient;

import java.io.File;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
public class JGitApacheAPIImplTest extends GitAPITestUpdate {
    @Override
    protected GitClient setupGitAPI(File ws) throws Exception {
        return Git.with(listener, env).in(ws).using("jgitapache").getClient();
    }

    @Override
    protected boolean getTimeoutVisibleInCurrentTest() {
        return true; // git client plugin 3.11.0 supports JGit timeout
    }

    @Override
    protected String getRemoteBranchPrefix() {
        return "";
    }
}
