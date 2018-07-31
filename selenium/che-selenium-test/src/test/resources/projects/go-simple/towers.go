//
// Copyright (c) 2012-2018 Red Hat, Inc.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
//   Red Hat, Inc. - initial API and implementation
//

package main

import (
	"fmt"
)

var count int

func hanoi(n int, a, b, c string) {
	if n == 1 {
		count++
		Print(COLOR_GREEN, fmt.Sprintf("Step %d: move disk from %s to %s\n", count, a, c))
		return
	}

	hanoi(n-1, a, c, b)
	count++
	Print(COLOR_YELLOW, fmt.Sprintf("Step %d: move disk from %s to %s\n", count, a, c))
	hanoi(n-1, b, a, c)
}

func main() {
	hanoi(3, "1", "2", "3")
}