#!groovy
@Library(['jenkins-shared-pipelines@gurka']) _

spacetimeApplication([
    disableIntegrationTestStage: true,
    disableStaticAnalysisStage: true,
    openshiftProject: 'sb-1079-spacetime-tools',
    openshiftClusters: [
            [name: 'scp-west-zone01-z01', credentialId: 'sb_1079_spacetime_tools_oc_token_west_zone01_z01_jib'],
            [name: 'scp-west-zone02-z01', credentialId: 'sb_1079_spacetime_tools_oc_token_west_zone02_z01_jib'],
    ],
    openshiftBaseImage: 'docker-swedbank.repository.swedbank.net/cloudbees/spacetime-runtime:jdk18.0.2',
    podTemplateOverrideImageTags: [ build: 'jdk18.0.2' ],
    disableDummyStage: false
])
