group = "com.willfp"
version = rootProject.version

subprojects {
    dependencies {
        compileOnly(project(":eco-core:core-proxy"))
        compileOnly(project(":eco-core:core-plugin"))
    }
}
