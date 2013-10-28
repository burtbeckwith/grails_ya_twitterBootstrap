class BootstrapStarterGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Twitter Bootstrap Starter Plugin" // Headline display name of the plugin
    def author = "Vedu Hariths"
    def authorEmail = "vedu@nsquaredglobal.com"
    def description = '''\
This is a adaptation of the twitter bootstrap to the grails starter project. It allows for the developer to use the twitter bootstrap resources without bloat. 
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/bootstrap-starter"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
   def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Nsquaredglobal", url: "http://nsquaredglobal.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
   def issueManagement = [ system: "Github", url: "https://github.com/hariths/grails_ya_twitterBootstrap/issues" ]

    //Online location of the plugin's browseable source code.
    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
