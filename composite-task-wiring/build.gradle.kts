tasks.register("publish") {
    dependsOn(":lib:publishMavenPublicationToMavenRepository")
    gradle.includedBuilds.forEach {
        dependsOn(it.task(":publishIncluded"))
    }
}