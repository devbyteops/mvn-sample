job('Demo-Maven-Project-Via-DSL') {
    description("Demo Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/giitCodes/mvn-sample.git", 'main')
    }
//     triggers {
//         scm('* * * * *')
    }
    steps {
        maven('clean package', 'pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}
