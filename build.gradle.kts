plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("flutterModuleAAR") {
            groupId = "com.example.my_flutter_module"
            artifactId = "flutter_release"
            version = "1.0"

            // Specify the AAR and POM file paths
            artifact(file("$rootDir/libs/com/example/my_flutter_module/flutter_release/1.0/flutter_release-1.0.aar")) {
                extension = "aar"
            }

            pom {
                name.set("Flutter Module AAR")
                description.set("A Flutter module packaged as an AAR")
//                url.set("https://github.com/your-username/flutter_module_repo")
            }
        }
    }

//    repositories {
//        maven {
//            // You can publish to the local repo for testing first
//            url = uri("${layout.buildDirectory}/repo")
//        }
//    }
}
