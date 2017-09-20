/**
 *  Circuits of Value
 *
 *  Copyright 2017 Shannon Code
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Circuits of Value",
    namespace: "decentric",
    author: "Shannon Code",
    description: "testing some integration with coval",
    category: "My Apps",
    iconUrl: "https://bittrexblobstorage.blob.core.windows.net/public/85cdc262-1870-4878-8562-43cc56faba2b.png",
    iconX2Url: "https://cdn-images-1.medium.com/max/700/1*WbjTOOzvg1rnTWnwBW7KDQ.png",
    iconX3Url: "https://cdn-images-1.medium.com/max/700/1*WbjTOOzvg1rnTWnwBW7KDQ.png")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers