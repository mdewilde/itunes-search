/*
	Copyright 2021 Marceau Dewilde <m@ceau.be>
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		https://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.itunesapi.http;

import java.io.IOException;

/**
 * Interface wrapping HTTP connection logic
 * 
 * @see URLConnector
 */
public interface Connector {

	/**
	 * Perform an HTTP request. Return the response body as {@link String}.
	 * 
	 * @param link
	 *            a full link, including scheme
	 * @return server response body as {@link String}, never {@code null}
	 * @throws IOException
	 *             if a problem occurred with the connection
	 */
	public String get(String link) throws IOException;

}
